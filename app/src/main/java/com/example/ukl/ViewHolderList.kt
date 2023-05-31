package com.example.ukl

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderList(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.template2, parent, false)),
    View.OnClickListener {
    private var imgView: ImageView? = null
    private var txtView1: TextView? = null
    private var txtView2: TextView? = null
    private var txtView3: TextView? = null
    private var btnFav: ImageButton? = null

    private var clicked = false

    init {
        imgView = itemView.findViewById(R.id.product_image)
        txtView1 = itemView.findViewById(R.id.txt_nama)
        txtView2 = itemView.findViewById(R.id.txt_harga)
        txtView3 = itemView.findViewById(R.id.txt_game)
        btnFav = itemView.findViewById(R.id.favorite_button)

        btnFav?.setOnClickListener(this)
    }

    fun bind(data: Item){
        imgView?.setImageResource(data.photo)
        txtView1?.text = data.name
        txtView2?.text = data.harga
        txtView3?.text = data.game
    }

    override fun onClick(p0: View?) {
        if(clicked == false){
            btnFav?.setBackgroundResource(R.drawable.ic_baseline_favorite_24)
            clicked = true
        }
        else{
            btnFav?.setBackgroundResource(R.drawable.ic_outline_favorite_border_24)
            clicked = false
        }
    }
}