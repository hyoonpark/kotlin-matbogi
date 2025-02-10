package com.example.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter() {

    // 아이템들의 개수
    override fun getCount(): Int {
        return List.size
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        var convertView = convertView

        if (convertView == null) {
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }

        // List[0] -> ListViewModel("a", "b")
        val title = convertView!!.findViewById<TextView>(R.id.listviewItem)
        title.text = List[position].title

        val content = convertView!!.findViewById<TextView>(R.id.listviewItem2)
        content.text = List[position].content

        return convertView!!
    }
}