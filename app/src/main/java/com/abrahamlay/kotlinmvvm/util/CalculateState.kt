package com.abrahamlay.kotlinmvvm.util

/**
 * Created by Abraham Lay on 2019-08-07.
 */

sealed class CalculateState {
    class SuccessCalculate(val result: String) : CalculateState()
    class Input1Empty : CalculateState()
    class Input2Empty : CalculateState()
}