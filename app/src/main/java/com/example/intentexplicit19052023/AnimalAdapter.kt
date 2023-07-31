package com.example.intentexplicit19052023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class AnimalAdapter(
    var listImageResources: List<Int>
) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    class AnimalViewHolder(view: View) : ViewHolder(view) {
        private var imgView = view.findViewById<ImageView>(R.id.image_view_animals)

        fun bind(resId: Int?) {
            resId ?: return
            imgView.setImageResource(resId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val layOutInflater = LayoutInflater.from(parent.context)
        val view = layOutInflater.inflate(R.layout.layout_item_image_animal, parent, false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listImageResources.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        holder.bind(listImageResources.getOrNull(position))
    }
}