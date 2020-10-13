package com.example.test

import android.icu.text.Transliterator
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_view.view.*

class RVAdapter : RecyclerView.Adapter<RVAdapter.AdapterView>(){



    val list = listOf("1", "2", "3", "4", "5", "6")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterView {
        return AdapterView(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_view, parent, false)
        )
    }

    override fun getItemCount(): Int = 6


    override fun onBindViewHolder(holder: AdapterView, position: Int) {
        holder.itemView.text.text = list[position]
        holder.itemView.card.setOnClickListener {
           toFuk()
        }
    }
    fun toFuk(){

    }

    class AdapterView (view: View) : RecyclerView.ViewHolder(view){

    }
}