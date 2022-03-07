package com.techx.zingmp3

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(
    private val listMusics: List<Music>
) : RecyclerView.Adapter<MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MusicViewHolder.from(parent)

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(listMusics[position])
    }

    override fun getItemCount() = listMusics.size
}
