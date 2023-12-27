package com.example.myappdesain.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myappdesain.data.model.ToursData
import com.example.myappdesain.databinding.ActivityMainBinding
import com.example.myappdesain.ui.adapter.MainListAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvTour.layoutManager = LinearLayoutManager(this)
        binding.rvTour.setHasFixedSize(true)
        binding.rvTour.adapter = MainListAdapter(ToursData.collection)
    }
}