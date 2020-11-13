package com.example.homeplanter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.view.MenuItem
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_splash.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvTanaman: RecyclerView
    private var list: ArrayList<tanaman> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTanaman = findViewById(R.id.rv_plant)
        rvTanaman.setHasFixedSize(true)

        list.addAll(koleksiTanaman.listData)
        lihatList()

        img_btn_user.setOnClickListener {
            val intent = Intent(this@MainActivity, Profil::class.java)
            startActivity(intent)
            finish()
        }

        tv_nama_bar.typeface = ResourcesCompat.getFont(this, R.font.best_wishes)
        tv_nama_bar.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30.toFloat())
    }

    private fun lihatList() {
        rvTanaman.layoutManager = LinearLayoutManager(this)
//        rvTanaman.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))
        val adapterTanaman = listTanamanAdapter(list)
        rvTanaman.adapter = adapterTanaman

        adapterTanaman.setOnItemClickCallback(object : listTanamanAdapter.OnItemClickCallback {

            override fun onItemClicked(data: tanaman) {
                val intent = Intent(this@MainActivity, detail_tanaman::class.java)
                intent.putExtra(detail_tanaman.EXTRA_NAME, data.nama)
                intent.putExtra(detail_tanaman.EXTRA_HARGA, data.harga)
                intent.putExtra(detail_tanaman.EXTRA_IKLIM, data.iklim)
                intent.putExtra(detail_tanaman.EXTRA_ASAL, data.asal)
                intent.putExtra(detail_tanaman.EXTRA_LATIN, data.nama_latin)
                intent.putExtra(detail_tanaman.EXTRA_DESKRIPSI, data.detail)
                intent.putExtra(detail_tanaman.EXTRA_GAMBAR, data.photo)
                startActivity(intent)
            }
        })

    }
}