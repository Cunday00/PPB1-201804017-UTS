package com.example.musik

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listbandadapter(private  val listband : ArrayList<band>):RecyclerView.Adapter<listbandadapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvband : TextView = itemView.findViewById(R.id.tv_band)
        var tvlagu : TextView = itemView.findViewById(R.id.tv_lagu)
        var ivlogo : ImageView = itemView.findViewById(R.id.civ_band)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
       val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_band, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listband.size
    }

    override fun onBindViewHolder(holder: listbandadapter.ListViewHolder, position: Int) {
        val band = listband[position]

        Glide.with(holder.itemView.context)
            .load(band.logo)
            .apply(RequestOptions().override(60,60 ))
            .into(holder.ivlogo)
        holder.tvband.text = band.nama
        holder.tvlagu.text = band.lagu
    }
}