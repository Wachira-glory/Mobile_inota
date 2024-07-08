package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.inotaplus.databinding.ActivityCollateralBinding
import com.akirachix.inotaplus.databinding.ActivityMilkBinding

class CollateralActivity:AppCompatActivity() {
    lateinit var binding: ActivityCollateralBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCollateralBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView18.setOnClickListener {
            val intent = Intent(this,HomepageActivity::class.java)
            startActivity(intent)
        }
    }
}

