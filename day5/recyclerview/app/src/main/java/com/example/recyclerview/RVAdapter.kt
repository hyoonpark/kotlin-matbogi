package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val items : MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)

        return ViewHolder(view)
    }

    interface ItemClick {
        fun onClick(view: View, position: Int)
    }
    var itemClick: ItemClick? = null

    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        if (itemClick != null) {
            holder.itemView.setOnClickListener { v ->
                itemClick?.onClick(v, position)
            }
        }

        holder.bindItems(items[position])
    }

    // 전체 리사이클러뷰의 개수
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item: String) {
            val rvText = itemView.findViewById<TextView>(R.id.rvText)
            rvText.text = item
        }

    }
}