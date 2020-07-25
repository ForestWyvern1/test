package vova.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        arrowback_menu.setOnClickListener {
            super.onBackPressed()
        }

        about_layout.setOnClickListener {
            toMain()
        }

        photoRobotb.setOnClickListener {

            toKartinochki()
        }

    }

    fun toKartinochki(){
        startActivity(Intent(this, KartinochkiActivity::class.java))
    }

    fun toMain(){
        startActivity(Intent(this, MainActivity::class.java))
    }

}