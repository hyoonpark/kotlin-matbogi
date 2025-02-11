package com.example.recyclerview

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = mutableListOf<String>()

        items.add("a")
        items.add("b")
        items.add("c")

        val rv = findViewById<RecyclerView>(R.id.rv)

        val adapter = RVAdapter(items)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)

        adapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {
                Toast.makeText(baseContext, items[position], Toast.LENGTH_LONG).show()
            }

        }
    }
}