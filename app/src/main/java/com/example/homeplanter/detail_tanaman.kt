package com.example.homeplanter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_tanaman.*

class detail_tanaman : AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "nama"
        const val EXTRA_HARGA = "harga"
        const val EXTRA_LATIN = "nama_latin"
        const val EXTRA_DESKRIPSI= "deskripsi"
        const val EXTRA_MATAHARI = "matahari"
        const val EXTRA_IKLIM = "iklim"
        const val EXTRA_GAMBAR = "gambar"
        const val EXTRA_ASAL = "asal"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tanaman)

        tv_harga.text = intent.getStringExtra(EXTRA_HARGA)
        tv_deskripsi.text = intent.getStringExtra(EXTRA_DESKRIPSI)
        tv_asal.text = intent.getStringExtra(EXTRA_ASAL)
        tv_iklim.text = intent.getStringExtra(EXTRA_IKLIM)
        tv_sinar.text = intent.getStringExtra(EXTRA_MATAHARI)
        img_tanaman.setImageResource(intent.getIntExtra(EXTRA_GAMBAR, 0))

    }
}