package vova.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        departmens.setOnClickListener {

        }

        wanted.setOnClickListener {

        }

        arrowback_menu.setOnClickListener {
            super.onBackPressed()
        }

        about_layout.setOnClickListener {
            toMain()
        }

        photoRobotb.setOnClickListener {

            toKartinochki()
        }

        paintb.setOnClickListener {

        }

        criminal.setOnClickListener {

        }

        wanted.setOnClickListener {
            toWnted()
        }

        logout.setOnClickListener {
            toSignning()
        }

    }

    fun toSignning(){
        startActivity(Intent(this, SigningActivity::class.java))
    }

    fun toWnted(){
        startActivity(Intent(this, WntedActivity::class.java))
    }

    fun toPaint(){
        startActivity(Intent(this, PaintActivity::class.java))
    }

    fun toKartinochki(){
        startActivity(Intent(this, KartinochkiActivity::class.java))
    }

    fun toMain(){
        startActivity(Intent(this, MainActivity::class.java))
    }

}