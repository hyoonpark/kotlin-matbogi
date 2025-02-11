package com.example.listviewreview

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listItem = mutableListOf<String>()

        listItem.add("A")
        listItem.add("B")
        listItem.add("C")

        val listView = findViewById<ListView>(R.id.mainListView)

        val adapter = ListViewAdapter(listItem)
        listView.adapter = adapter
        
        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, listItem[position], Toast.LENGTH_LONG).show()

        }
    }
}