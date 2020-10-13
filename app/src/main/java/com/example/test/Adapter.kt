package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_view.view.*

class Adapter : RecyclerView.Adapter<Adapter.RVadapter>() {
    val list = listOf("1", "2", "3", "4")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVadapter {
        return RVadapter(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_view, parent, false)
        )
    }

    override fun getItemCount(): Int = 4

    override fun onBindViewHolder(holder: RVadapter, position: Int) {
        holder.itemView.text.text = list [position]
    }
    class RVadapter(view: View) : RecyclerView.ViewHolder(view)
}