package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.colormyviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            binding.textView3.setBackgroundColor(Color.RED)
        }

        binding.button2.setOnClickListener {
            binding.textView4.setBackgroundColor(Color.YELLOW)
        }

        binding.button4.setOnClickListener {
            binding.textView5.setBackgroundColor(Color.BLUE)
        }

        binding.textView.setOnClickListener{
            binding.textView.setBackgroundColor(Color.DKGRAY)
        }

        binding.textView2.setOnClickListener{
            binding.textView2.setBackgroundColor(Color.CYAN)
        }

        binding.textView3.setOnClickListener{
            binding.textView3.setBackgroundColor(Color.MAGENTA)
        }

        binding.textView4.setOnClickListener{
            binding.textView4.setBackgroundColor(Color.GREEN)
        }

        binding.textView5.setOnClickListener{
            binding.textView5.setBackgroundColor(Color.LTGRAY)
        }
        }
    }

