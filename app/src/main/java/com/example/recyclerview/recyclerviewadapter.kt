package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class recyclerviewadapter (private val items: List<data>) : RecyclerView.Adapter<recyclerviewadapter.recyclerViewHolder>(){
    class recyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val  imageview: ImageView = itemView.findViewById(R.id.imageView)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return recyclerViewHolder(view)
    }


    override fun onBindViewHolder(holder: recyclerViewHolder, position: Int) {
        val a = items[position]
        Glide.with(holder.imageview.context)
            .load(a.link)
            .centerCrop()
            .into(holder.imageview)



    }

    override fun getItemCount(): Int = items.size


}