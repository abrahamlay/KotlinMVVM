package com.abrahamlay.kotlinmvvm.fibonnaci

import com.abrahamlay.kotlinmvvm.util.CalculateListener
import com.abrahamlay.kotlinmvvm.util.postDelayed

/**
 * Created by Abraham Lay on 2019-08-07.
 */

class FibonacciFunctionInteractor {
    fun calculate(input1: String, calculateListener: CalculateListener) {
        postDelayed(1000) {
            when {
                input1.isEmpty() -> calculateListener.onInput1Empty()
                else -> calculateListener.onSuccess(fibonacciFunction(input1))
            }
        }
    }

    fun fibonacciFunction(input1: String): String {
        val n = input1.toInt()
        var result = ""

        for (number in 0 until n) {
            val resultInt = fibonacciRecursive(number)
            result += if(number == 0){
                "$resultInt"
            }else{
                ", $resultInt"
            }

        }

        return result
    }

    private fun fibonacciRecursive(n: Int): Int {
        if (n == 0) {
            return 0
        }
        if (n == 1) {
            return 1
        }

        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }
}