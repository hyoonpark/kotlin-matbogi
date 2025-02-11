package com.example.trotlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer1Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_singer1, container, false)

        val items = mutableListOf<String>()

        items.add("니가 왜 거기서 나와")
        items.add("막걸리 한잔")
        items.add("찐이야")
        items.add("비상")
        items.add("니가 왜 거기서 나와")
        items.add("막걸리 한잔")
        items.add("찐이야")
        items.add("비상")
        items.add("니가 왜 거기서 나와")
        items.add("막걸리 한잔")
        items.add("찐이야")
        items.add("비상")
        items.add("니가 왜 거기서 나와")
        items.add("막걸리 한잔")
        items.add("찐이야")
        items.add("비상")


        val rv = view.findViewById<RecyclerView>(R.id.rv1)
        val adapter = RVAdapter(items)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.woong).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer2Fragment)
        }

        view.findViewById<ImageView>(R.id.gain).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer1Fragment_to_singer3Fragment)
        }

        return view
    }

}