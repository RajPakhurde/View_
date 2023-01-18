package com.rajpakhurde.view_model_demo_counter

import androidx.lifecycle.ViewModel

class MainAcivityViewModel(startingSum: Int): ViewModel() {
    private var sum = 0

    init {
        sum = startingSum
    }

    fun getCurrentSum(): Int {
        return sum
    }
    fun getUpdatedSum(num: Int): Int {
        sum = sum + num
        return sum
    }
}