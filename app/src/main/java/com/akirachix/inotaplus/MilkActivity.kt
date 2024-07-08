package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.inotaplus.databinding.ActivityMainBinding
import com.akirachix.inotaplus.databinding.ActivityMilkBinding
import com.akirachix.new_mentorgram.LoginActivity

class MilkActivity:AppCompatActivity() {
    lateinit var binding: ActivityMilkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMilkBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView9.setOnClickListener {
            val intent = Intent(this,HomepageActivity::class.java)
            startActivity(intent)
        }
        binding.imageView16.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }

}