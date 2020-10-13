package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragment()
        bn.setOnNavigationItemSelectedListener {item ->
            when (item.itemId) {
                R.id.smokeone -> {
                    openFragment()
                }
                R.id.smoketwo -> {
                    openFragmentSec()
                }
            }
            true
        }


    }

    override fun onBackPressed() {
        finishAffinity()
    }
    fun changeFragment(fmt: androidx.fragment.app.Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_holder, fmt).addToBackStack(null).commit()
    }
    fun openFragment(){
        changeFragment(Fragment())
    }
    fun openFragmentSec(){
        changeFragment(Fragmentsec())
    }
}