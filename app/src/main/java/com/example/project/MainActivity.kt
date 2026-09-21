package com.example.project

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.project.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // dùng view trực tiếp, không cần findViewById
        binding.tvName.text = "Nguyễn Bảo Phúc"
    }
}