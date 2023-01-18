package com.rajpakhurde.view_model_demo_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.rajpakhurde.view_model_demo_counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainAcivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(100)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainAcivityViewModel::class.java)


        binding.tvSum.text = viewModel.getCurrentSum().toString()

        binding.apply {
            btnAdd.setOnClickListener {
                tvSum.text = viewModel.getUpdatedSum(etInput.text.toString().toInt()).toString()
            }
        }

    }
}