package com.example.listview

import android.os.Bundle
import android.widget.ListView
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

        val listItem = mutableListOf<ListViewModel>()

        listItem.add(ListViewModel("a", "b"))
        listItem.add(ListViewModel("c", "d"))
        listItem.add(ListViewModel("e", "f"))


        val listView = findViewById<ListView>(R.id.mainListview)

        val listAdapter = ListViewAdapter(listItem)

        listView.adapter = listAdapter
    }
}