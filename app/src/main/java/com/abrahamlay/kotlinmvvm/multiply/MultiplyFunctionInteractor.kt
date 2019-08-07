package com.abrahamlay.kotlinmvvm.multiply

import com.abrahamlay.kotlinmvvm.util.CalculateListener
import com.abrahamlay.kotlinmvvm.util.postDelayed

/**
 * Created by Abraham Lay on 2019-08-07.
 */

class MultiplyFunctionInteractor {
    fun calculate(input1: String, input2: String, calculateListener: CalculateListener) {
        postDelayed(1000) {
            when {
                input1.isEmpty() -> calculateListener.onInput1Empty()
                input2.isEmpty() -> calculateListener.onInput2Empty()
                else -> calculateListener.onSuccess(multiplyFunction(input1, input2))
            }
        }
    }

    fun multiplyFunction(input1: String, input2: String): String {
        return (input1.toInt() * input2.toInt()).toString()
    }
}