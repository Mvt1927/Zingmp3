package com.techx.zingmp3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.techx.zingmp3.databinding.ItemMusicBinding

class MusicViewHolder private constructor(
    private val binding: ItemMusicBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): MusicViewHolder {
            val binding = ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return MusicViewHolder(binding)
        }
    }

    fun bind(music: Music) {
        binding.music.text = music.name
        binding.singer.text = music.singer
    }
}
