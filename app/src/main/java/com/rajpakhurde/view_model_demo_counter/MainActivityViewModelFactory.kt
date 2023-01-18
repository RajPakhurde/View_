package com.rajpakhurde.view_model_demo_counter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainActivityViewModelFactory(private var startingSum: Int): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainAcivityViewModel::class.java)) {
            return MainAcivityViewModel(startingSum) as T
        }
        throw IllegalArgumentException("Unknown View Model Class ")
    }
}