package com.example.trotlist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer3Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_singer3, container, false)

        val items = mutableListOf<String>()

        items.add("서울의 달")
        items.add("엄마아리랑")
        items.add("거문고야")
        items.add("용두산 엘레지")
        items.add("서울의 달")
        items.add("엄마아리랑")
        items.add("거문고야")
        items.add("용두산 엘레지")
        items.add("서울의 달")
        items.add("엄마아리랑")
        items.add("거문고야")
        items.add("용두산 엘레지")
        items.add("서울의 달")
        items.add("엄마아리랑")
        items.add("거문고야")
        items.add("용두산 엘레지")

        val rv = view.findViewById<RecyclerView>(R.id.rv3)
        val adapter = RVAdapter(items)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.tak).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.woong).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer3Fragment_to_singer2Fragment)
        }

        return view
    }


}