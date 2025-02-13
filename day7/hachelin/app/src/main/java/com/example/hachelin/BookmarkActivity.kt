package com.example.hachelin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore

class BookmarkActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    val contentsModelList = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)

        val db = Firebase.firestore
        auth = Firebase.auth
        val docRef = db.collection("bookmarks").document(auth.currentUser!!.uid)

        val recyclerView = findViewById<RecyclerView>(R.id.bookmarkRV)
        val adapter = RVAdapter(baseContext, contentsModelList)
        recyclerView.adapter = adapter

        recyclerView.layoutManager = GridLayoutManager(this, 2 )

        docRef.get()
            .addOnSuccessListener { document ->
                contentsModelList.clear()

                if (document != null && document.exists()) {
                    // Firestore에서 데이터 가져오기
                    val url = document.getString("url") ?: ""
                    val imageUrl = document.getString("imageUrl") ?: ""
                    val title = document.getString("title") ?: ""


                    // DataModel 객체 생성 및 리스트에 추가
                    val contentsModel = ContentsModel(url, imageUrl, title)
                    contentsModelList.add(contentsModel)
                }

                adapter.notifyDataSetChanged()

            }
            .addOnFailureListener { exception ->
                // 에러 처리
                println("데이터 가져오기 실패: $exception")
            }

    }
}