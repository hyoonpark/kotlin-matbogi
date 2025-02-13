package com.example.hachelin

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        auth = Firebase.auth

        if (auth.currentUser?.uid == null) {
            // 회원가입 필요
            Handler().postDelayed({
                startActivity(Intent(this, JoinActivity::class.java))
                finish()
            }, 2500)

        } else {
            // 메인화면으로 이동
            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 2500)

        }


    }
}