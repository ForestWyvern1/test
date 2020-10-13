package com.example.test

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment.*

class Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardfragment.setOnClickListener {
            Toast.makeText(activity, "Xyn", Toast.LENGTH_SHORT).show()
            toNice()
        }

        rvFragment.layoutManager = LinearLayoutManager(activity)
        rvFragment.adapter = RVFragmentAdapter()
    }
    fun toNice(){
        startActivity(Intent(activity, NiceActivity::class.java))
    }

}