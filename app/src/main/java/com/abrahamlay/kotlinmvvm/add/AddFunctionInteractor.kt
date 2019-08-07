package com.abrahamlay.kotlinmvvm.add

import com.abrahamlay.kotlinmvvm.util.CalculateListener
import com.abrahamlay.kotlinmvvm.util.postDelayed

/**
 * Created by Abraham Lay on 2019-08-07.
 */

class AddFunctionInteractor {
    fun calculate(input1: String, input2: String, calculateListener: CalculateListener) {
        postDelayed(1000) {
            when {
                input1.isEmpty() -> calculateListener.onInput1Empty()
                input2.isEmpty() -> calculateListener.onInput2Empty()
                else -> calculateListener.onSuccess(addFunction(input1, input2))
            }
        }
    }

    fun addFunction(input1: String, input2: String): String {
        return (input1.toInt() + input2.toInt()).toString()
    }
}