package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.akirachix.inotaplus.databinding.ActivityLoanBinding
import com.akirachix.inotaplus.databinding.ActivityMilkBinding
import com.akirachix.new_mentorgram.LoginActivity

class LoanActivity: AppCompatActivity(){
    lateinit var binding: ActivityLoanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoanBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageView22.setOnClickListener {
            val intent = Intent(this,HomepageActivity::class.java)
            startActivity(intent)
        }
        binding.imageView24.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }

}
