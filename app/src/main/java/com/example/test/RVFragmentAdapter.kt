package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class RVFragmentAdapter : RecyclerView.Adapter<RVFragmentAdapter.RVAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter {
        return RVFragmentAdapter.RVAdapter(LayoutInflater.from(parent.context).inflate(R.layout.rv_view, parent, false))
    }

    override fun getItemCount(): Int = 7

    override fun onBindViewHolder(holder: RVAdapter, position: Int) {

    }

    class RVAdapter(view: View) : RecyclerView.ViewHolder(view)
}