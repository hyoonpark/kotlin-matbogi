package com.example.dietmemo

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // auth 초기화를 먼저 수행
        auth = Firebase.auth


        // 현재 로그인된 사용자 확인
        val currentUser = auth.currentUser
        
        if (currentUser != null) {
            // 이미 로그인된 사용자가 있는 경우
            Log.d("Splash", currentUser.uid)
            Handler().postDelayed({
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 3000)
        } else {
            // 로그인된 사용자가 없는 경우
            Log.e("Splash", "회원가입 또는 로그인 필요")
            
            auth.signInAnonymously()
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(baseContext, "성공", Toast.LENGTH_SHORT).show()
                        Handler().postDelayed({
                            startActivity(Intent(this, MainActivity::class.java))
                            finish()
                        }, 3000)
                    } else {
                        Toast.makeText(baseContext, "Authentication failed.", Toast.LENGTH_SHORT).show()
                    }
                }
        }
    }
}