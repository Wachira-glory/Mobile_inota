package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.inotaplus.databinding.ActivityMessageBinding
import com.akirachix.inotaplus.databinding.ActivityMilkBinding
import com.akirachix.new_mentorgram.LoginActivity

class MessageActivity : AppCompatActivity() {
    lateinit var binding: ActivityMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessageBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        binding.imageView33.setOnClickListener {
            val intent= Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.imageView31.setOnClickListener {
            val intent= Intent(this, HomepageActivity::class.java)
            startActivity(intent)
        }

    }
}