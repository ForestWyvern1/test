package vova.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_wnted.*

class WntedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wnted)

        trash.setOnClickListener {
            manko.visibility = View.GONE
            kraev.visibility = View.GONE
            mudjipov.visibility = View.GONE
            lopuhov.visibility = View.GONE
            chq.visibility = View.VISIBLE
            chw.visibility = View.VISIBLE
            che.visibility = View.VISIBLE
            chr.visibility = View.VISIBLE
            frame.visibility = View.VISIBLE

        }
        arrowback.setOnClickListener {
            super.onBackPressed()
        }

        delete.setOnClickListener {
            manko.visibility = View.VISIBLE
            kraev.visibility = View.VISIBLE
            mudjipov.visibility = View.VISIBLE
            lopuhov.visibility = View.VISIBLE
            chq.visibility = View.GONE
            chw.visibility = View.GONE
            che.visibility = View.GONE
            chr.visibility = View.GONE
            frame.visibility = View.GONE
        }

    }
}