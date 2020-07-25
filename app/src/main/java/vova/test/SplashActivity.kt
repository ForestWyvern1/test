package vova.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()

        startActivity(Intent(this, SigningActivity::class.java))
    }
}