package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.inotaplus.databinding.ActivityLandingBinding
import com.akirachix.inotaplus.databinding.ActivityMilkBinding
import com.akirachix.new_mentorgram.LoginActivity

class LandingActivity: AppCompatActivity() {
    lateinit var binding: ActivityLandingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLandingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView29.setOnClickListener {
            val intent = Intent (this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}