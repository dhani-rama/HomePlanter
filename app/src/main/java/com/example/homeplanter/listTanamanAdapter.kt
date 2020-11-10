package com.example.homeplanter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listTanamanAdapter (private val listTanaman : ArrayList<tanaman>) : RecyclerView.Adapter<listTanamanAdapter.listTanamanHolderView>() {

    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): listTanamanAdapter.listTanamanHolderView {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_tanaman,parent,false)
        return listTanamanHolderView(view)
    }

    override fun onBindViewHolder(holder: listTanamanAdapter.listTanamanHolderView, position: Int) {
        val tanaman = listTanaman[position]

        Glide.with(holder.itemView.context)
                .load(tanaman.photo)
                .apply(RequestOptions().override(55, 55))
                .into(holder.gambarTanaman)

        holder.tvNamaTanaman.text = tanaman.nama
        holder.tvHargaTanaman.text = tanaman.harga

        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listTanaman[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listTanaman.size
    }

    inner class listTanamanHolderView(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var tvNamaTanaman : TextView = itemView.findViewById(R.id.tv_nama_tanaman)
        var tvHargaTanaman : TextView = itemView.findViewById(R.id.tv_harga)
        var gambarTanaman : ImageView = itemView.findViewById(R.id.img_tanaman)
    }

    interface OnItemClickCallback{
        fun onItemClicked(data: tanaman)
    }

}