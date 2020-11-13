package com.example.homeplanter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.TypedValue
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_splash.*

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@Splash, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

        tv_nama_logo.typeface = ResourcesCompat.getFont(this, R.font.best_wishes)
        tv_nama_logo.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50.toFloat())

    }
}