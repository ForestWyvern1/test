package vova.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_signing.*

class SigningActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signing)

        buttonw.setOnClickListener {
            captcha_layout.visibility = View.VISIBLE
            layout_buttons.visibility = View.GONE
        }
        buttonq.setOnClickListener {
            captcha_layout.visibility = View.VISIBLE
            layout_buttons.visibility = View.GONE
        }

        buttone.setOnClickListener {
            toMenu()
        }
    }

    fun toMenu(){
        startActivity (Intent(this, MenuActivity::class.java))
    }

    override fun onBackPressed() {
        finishAffinity()
    }
}