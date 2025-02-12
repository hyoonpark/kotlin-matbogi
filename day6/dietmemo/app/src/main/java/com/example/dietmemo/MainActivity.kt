package com.example.dietmemo

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.icu.util.GregorianCalendar
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.ImageView
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore


class MainActivity : AppCompatActivity() {

    val dataModelList = mutableListOf<DataModel>()

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.mainLV)
        val adapter = ListViewAdapter(dataModelList)
        auth = Firebase.auth

        listView.adapter = adapter

        val db = Firebase.firestore
        val docRef = db.collection("myMemo").document(auth.currentUser!!.uid)
        docRef.get()
            .addOnSuccessListener { document ->
                dataModelList.clear()

                if (document != null && document.exists()) {
                    // Firestore에서 데이터 가져오기
                    val dateText = document.getString("dateText") ?: ""
                    val memo = document.getString("memo") ?: ""
                    
                    // DataModel 객체 생성 및 리스트에 추가
                    val dataModel = DataModel(dateText, memo)
                    dataModelList.add(dataModel)
                }

                adapter.notifyDataSetChanged()
            }
            .addOnFailureListener { exception ->
                // 에러 처리
                println("데이터 가져오기 실패: $exception")
            }

        val writeBtn = findViewById<ImageView>(R.id.writeBtn)
        writeBtn.setOnClickListener {

            val mDialogView = LayoutInflater.from(this).inflate(R.layout.cutom_dialog, null)
            val mBuilder = AlertDialog.Builder(this)
                .setView(mDialogView)
                .setTitle("운동 메모 다이얼로그")

            val mAlertDialog =  mBuilder.show()

            val selectDateBtn = mAlertDialog.findViewById<Button>(R.id.selectDateBtn)

            var dateText = ""

            selectDateBtn?.setOnClickListener {

                val today = GregorianCalendar()
                val year : Int = today.get(Calendar.YEAR)
                val month : Int = today.get(Calendar.MONTH)
                val date : Int = today.get(Calendar.DATE)

                val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener{
                    override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

                        selectDateBtn.setText("${year}, ${month + 1}, ${dayOfMonth}")

                        dateText = "${year}, ${month + 1}, ${dayOfMonth}"
                    }
                }, year, month, date)

                dlg.show()
            }

            val saveBtn = mAlertDialog.findViewById<Button>(R.id.saveBtn)

            saveBtn?.setOnClickListener {

                val memo = mAlertDialog.findViewById<EditText>(R.id.dietMemo)?.text.toString()

                val db = Firebase.firestore

                val model = DataModel(dateText, memo)

                // 파이어베이스 데이터 저장
                db.collection("myMemo").document(Firebase.auth.currentUser!!.uid)
                    .set(model)
                    .addOnSuccessListener {
                        // 저장 성공 후 리스트 새로고침
                        dataModelList.add(model)
                        adapter.notifyDataSetChanged()
                    }

                mAlertDialog.dismiss()  // 창 닫기
            }
        }

    }
}