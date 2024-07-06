package com.akirachix.inotaplus

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.inotaplus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idLogin.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener{
            validateRegistration()
        }
    }
    fun validateRegistration() {
        var formError = false
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()) {
            formError = true
            binding.tilFirstName.error = "First name is required"
        }
        val secondName = binding.etSecondName.text.toString()
        if (secondName.isBlank()) {
            formError = true
            binding.tilSecondName.error = "Second name is required"
        }
        val membershipNumberLogin=binding.etMembershipNumber.text.toString()
        if(membershipNumberLogin.isBlank()){
            formError=true
            binding.tilMembershipNumber.error="Membership Number is required"
        }
        val password=binding.etPassword.text.toString()
        if(password.isBlank()){
            formError=true
            binding.tilPassword.error="Password  is required"
        }
        val confirmPassword=binding.etConfirmPassword.text.toString()
        if(confirmPassword.isBlank()){
            formError=true
            binding.tilConfirmPassword.error="Password is required"
        }

    }
    fun clearForms(){
        binding.tilFirstName.error=null
        binding.tilSecondName.error=null
        binding.tilPassword.error=null
        binding.tilConfirmPassword.error=null
        binding.tilMembershipNumber.error=null
        binding.tilPassword.error=null
        binding.tilConfirmPassword.error=null
    }

}

