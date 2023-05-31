package com.example.ukl

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val data: ArrayList<Item>): RecyclerView.Adapter<ViewHolderList>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderList {
        val inflater = LayoutInflater.from(parent.context)
        return ViewHolderList(inflater, parent)
    }

    override fun onBindViewHolder(holder: ViewHolderList, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }
}