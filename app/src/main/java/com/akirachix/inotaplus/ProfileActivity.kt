package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.inotaplus.databinding.ActivityMilkBinding
import com.akirachix.inotaplus.databinding.ActivityProfileBinding

class ProfileActivity:AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView26.setOnClickListener {
            val intent = Intent(this,HomepageActivity::class.java)
            startActivity(intent)
        }
    }
}

