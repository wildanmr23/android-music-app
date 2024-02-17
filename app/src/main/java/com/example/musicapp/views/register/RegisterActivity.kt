package com.example.musicapp.views.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.musicapp.R
import com.example.musicapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        onClick()

    }

    private fun onClick() {
        binding.tbRegister.setNavigationOnClickListener {
            finish()
        }

        binding.btnNewRegister.setOnClickListener {
            finish()
        }

        binding.btnRegister.setOnClickListener {
            finish()
        }
    }

    private fun init(){
        //Setup Support Action Bar
        setSupportActionBar(binding.tbRegister)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = null
    }
}