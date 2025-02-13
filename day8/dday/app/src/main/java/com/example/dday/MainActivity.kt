package com.example.dday

import android.app.DatePickerDialog
import android.icu.util.Calendar
import android.icu.util.GregorianCalendar
import android.icu.util.TimeUnit
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.startBtn)
        val endBtn = findViewById<Button>(R.id.endBtn)
        var startDate = ""
        var endDate = ""

        val calendarStart = Calendar.getInstance()
        val calendarEnd = Calendar.getInstance()


        startBtn.setOnClickListener {

            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)


            val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

                     startDate = "${year} + ${month + 1} + ${day}"

                    calendarStart.set(year, month+1, dayOfMonth)

                }

            }, year, month, day)
            dlg.show()

        }

        endBtn.setOnClickListener {

            val today = GregorianCalendar()
            val year = today.get(Calendar.YEAR)
            val month = today.get(Calendar.MONTH)
            val day = today.get(Calendar.DATE)


            val dlg = DatePickerDialog(this, object : DatePickerDialog.OnDateSetListener {
                override fun onDateSet(view: DatePicker?, year: Int, month: Int, dayOfMonth: Int) {

                    endDate = "${year} + ${month + 1} + ${day}"

                    calendarEnd.set(year, month+1, dayOfMonth)

                    val diffMillis = calendarEnd.timeInMillis - calendarStart.timeInMillis
                    val diffDays = diffMillis / (24 * 60 * 60 * 1000)

                    findViewById<TextView>(R.id.dDay).text = "D${if (diffDays >= 0) "+" else "-"}${Math.abs(diffDays)}"
                }

            }, year, month, day)
            dlg.show()

        }

    }
}