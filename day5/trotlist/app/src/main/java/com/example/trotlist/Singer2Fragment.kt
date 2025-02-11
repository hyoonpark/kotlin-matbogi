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

class Singer2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        val items = mutableListOf<String>()

        items.add("사랑은 늘 도망가")
        items.add("이젠 나만 믿어요")
        items.add("우리들의 블루스")
        items.add("다시 만날 수 있을까")
        items.add("사랑은 늘 도망가")
        items.add("이젠 나만 믿어요")
        items.add("우리들의 블루스")
        items.add("다시 만날 수 있을까")
        items.add("사랑은 늘 도망가")
        items.add("이젠 나만 믿어요")
        items.add("우리들의 블루스")
        items.add("다시 만날 수 있을까")
        items.add("사랑은 늘 도망가")
        items.add("이젠 나만 믿어요")
        items.add("우리들의 블루스")
        items.add("다시 만날 수 있을까")

        val rv = view.findViewById<RecyclerView>(R.id.rv2)
        val adapter = RVAdapter(items)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.tak).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.gain).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }

        return view
    }

}