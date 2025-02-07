package com.example.databinding

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 1. findViewById 사용
//        val btn = findViewById<Button>(R.id.testBtnId)
//        btn.setOnClickListener{
//            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
//        }

        // 2. databinding 사용
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.testBtnId.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }
    }
}