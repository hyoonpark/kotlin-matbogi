package com.example.hachelin

import android.os.Bundle
import android.webkit.WebView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.firestore.firestore

class ViewActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        val webView = findViewById<WebView>(R.id.webView)
        webView.loadUrl(intent.getStringExtra("url").toString())

        val db = Firebase.firestore
        auth = Firebase.auth
        val docRef = db.collection("bookmarks").document(auth.currentUser!!.uid)

        val url = intent.getStringExtra("url").toString()
        val imageUrl = intent.getStringExtra("imageUrl").toString()
        val title = intent.getStringExtra("title").toString()

        val save = findViewById<TextView>(R.id.save)
        save.setOnClickListener {
            docRef.set(ContentsModel(url, imageUrl, title))
        }
    }
}