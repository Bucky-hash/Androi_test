package com.example.project

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.project.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // 1. apply — khởi tạo binding và gán content view cùng lúc
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }
        // 2. with — set nhiều thuộc tính trên cùng 1 view
        with(binding.tvName) {
            text = "Nguyễn Bảo Phúc"
            textSize = 20f
        }
        // 3. let — xử lý insets, chỉ chạy khi view tìm thấy (non-null an toàn)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            insets.getInsets(WindowInsetsCompat.Type.systemBars()).let { systemBars ->
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            }
            insets
        }
    }