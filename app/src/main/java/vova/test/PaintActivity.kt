package vova.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_paint.*

class PaintActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paint)
        arrowback.setOnClickListener {
            super.onBackPressed()
        }

        share.setOnClickListener {

        }

        rainbow.setOnClickListener {

        }

        pen.setOnClickListener {

        }
        erase.setOnClickListener {

        }
    }
}