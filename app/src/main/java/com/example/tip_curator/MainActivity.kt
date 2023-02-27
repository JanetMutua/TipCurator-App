package com.example.tip_curator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tip_curator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    Top level variable to be used across different methods in this class
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}