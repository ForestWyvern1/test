package vova.test

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kartinochki.*

class KartinochkiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kartinochki)

        plus.setOnClickListener {
            toNewPhoto()
        }

        arrowbackmen.setOnClickListener {
            super.onBackPressed()
        }

        }

    fun toNewPhoto(){
        startActivity(Intent(this, NewphotoActivity::class.java))
    }

}