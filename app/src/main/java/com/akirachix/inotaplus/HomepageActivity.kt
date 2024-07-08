package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.inotaplus.databinding.ActivityHomepageBinding
import com.akirachix.inotaplus.databinding.ActivityMainBinding
import com.akirachix.new_mentorgram.LoginActivity


class HomepageActivity :AppCompatActivity(){
    lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHistory.setOnClickListener {
            val intent = Intent(this,MilkActivity::class.java)
            startActivity(intent)
        }

        binding.tvCollateral.setOnClickListener {
            val intent = Intent(this,CollateralActivity::class.java)
            startActivity(intent)
        }

        binding.tvLoan.setOnClickListener {
            val intent = Intent(this,LoanActivity::class.java)
            startActivity(intent)
        }

        binding.tvProfile.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }
        binding.imageView4.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        binding.imageView6.setOnClickListener {
            val intent =Intent(this,MessageActivity::class.java)
            startActivity(intent)
        }

    }
}