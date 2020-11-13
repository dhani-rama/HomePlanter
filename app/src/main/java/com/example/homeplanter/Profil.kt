package com.example.homeplanter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profil.*
import kotlinx.android.synthetic.main.activity_profil.tv_nama_bar

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        img_btn_back.setOnClickListener {
            val intent = Intent(this@Profil, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        tv_nama_bar.typeface = ResourcesCompat.getFont(this, R.font.best_wishes)
        tv_nama_bar.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30.toFloat())
    }
}