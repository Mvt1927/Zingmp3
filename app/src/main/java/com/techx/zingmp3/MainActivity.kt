/*
 * Copyright (c) 2022. Mvt1927
 */

package com.techx.zingmp3

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.techx.zingmp3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listMusics.run {
            layoutManager = LinearLayoutManager(this.context)
            setHasFixedSize(true)
            adapter = MusicAdapter(Musics)
        }

        binding.plus.setOnClickListener {
            val intent = Intent(this, AddMusicActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onResume() {
        super.onResume()
        binding.listMusics.adapter?.notifyDataSetChanged()
    }
    companion object {
        val Musics = mutableListOf<Music>()
    }
}