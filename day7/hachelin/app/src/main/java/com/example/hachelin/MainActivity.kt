package com.example.hachelin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val items = mutableListOf<ContentsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/1207427",
                "https://img.siksinhot.com/place/1612763235847249.PNG?w=307&h=300&c=Y",
                "스시쿠도쿠"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/453025",
                "https://img.siksinhot.com/place/1519737210539269.jpg?w=307&h=300&c=Y",
                "해성막창집"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/481371",
                "https://img.siksinhot.com/place/1609141658676332.jpg?w=307&h=300&c=Y",
                "맛나집"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/343645",
                "https://img.siksinhot.com/place/1492502913897118.JPG?w=307&h=300&c=Y",
                "대길고추불고기"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/355196",
                "https://img.siksinhot.com/place/1413946971907048.jpg?w=307&h=300&c=Y",
                "소다미김밥"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/421419",
                "https://img.siksinhot.com/place/1581639429195485.jpg?w=307&h=300&c=Y",
                "스시심"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/396337",
                "https://img.siksinhot.com/place/1522222428327856.jpg?w=307&h=300&c=Y",
                "칠성돌곱창"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/356793",
                "https://img.siksinhot.com/place/1533529525575660.jpg?w=307&h=300&c=Y",
                "부산족발"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/1207427",
                "https://img.siksinhot.com/place/1612763235847249.PNG?w=307&h=300&c=Y",
                "스시쿠도쿠"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/453025",
                "https://img.siksinhot.com/place/1519737210539269.jpg?w=307&h=300&c=Y",
                "해성막창집"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/481371",
                "https://img.siksinhot.com/place/1609141658676332.jpg?w=307&h=300&c=Y",
                "맛나집"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/343645",
                "https://img.siksinhot.com/place/1492502913897118.JPG?w=307&h=300&c=Y",
                "대길고추불고기"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/355196",
                "https://img.siksinhot.com/place/1413946971907048.jpg?w=307&h=300&c=Y",
                "소다미김밥"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/421419",
                "https://img.siksinhot.com/place/1581639429195485.jpg?w=307&h=300&c=Y",
                "스시심"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/396337",
                "https://img.siksinhot.com/place/1522222428327856.jpg?w=307&h=300&c=Y",
                "칠성돌곱창"
            )
        )

        items.add(
            ContentsModel(
                "https://www.siksinhot.com/P/356793",
                "https://img.siksinhot.com/place/1533529525575660.jpg?w=307&h=300&c=Y",
                "부산족발"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        val adapter = RVAdapter(baseContext, items)
        recyclerView.adapter = adapter

        adapter.itemClick = object : RVAdapter.ItemClick {
            override fun onClick(view: View, position: Int) {

                val intent = Intent(baseContext, ViewActivity::class.java)
                intent.putExtra("url", items[position].url)
                intent.putExtra("imageUrl", items[position].imageUrl)
                intent.putExtra("title", items[position].title)
                startActivity(intent)
            }

        }

        recyclerView.layoutManager = GridLayoutManager(this, 2 )

    }
}