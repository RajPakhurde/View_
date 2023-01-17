package com.rajpakhurde.view_model_demo_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.rajpakhurde.view_model_demo_counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.tvCount.text = count.toString()

        binding.apply {
            btnClickMe.setOnClickListener {
                count++
                tvCount.text = count.toString()
            }
        }
    }
}