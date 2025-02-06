package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val img1 = findViewById<ImageView>(R.id.img_1)
        img1.setOnClickListener {

            Toast.makeText(this, "클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)

        }

        val img2 = findViewById<ImageView>(R.id.img_2)
        img2.setOnClickListener {

            Toast.makeText(this, "클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)

        }

        val img3 = findViewById<ImageView>(R.id.img_3)
        img3.setOnClickListener {

            Toast.makeText(this, "클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)

        }

        val img4 = findViewById<ImageView>(R.id.img_4)
        img4.setOnClickListener {

            Toast.makeText(this, "클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)

        }

        val img5 = findViewById<ImageView>(R.id.img_5)
        img5.setOnClickListener {

            Toast.makeText(this, "클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)

        }

        val img6 = findViewById<ImageView>(R.id.img_6)
        img6.setOnClickListener {

            Toast.makeText(this, "클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)

        }

        val img7 = findViewById<ImageView>(R.id.img_7)
        img7.setOnClickListener {

            Toast.makeText(this, "클릭 완료", Toast.LENGTH_LONG).show()

            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)

        }
    }
}