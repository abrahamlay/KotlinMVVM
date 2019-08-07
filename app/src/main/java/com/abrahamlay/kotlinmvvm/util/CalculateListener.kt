package com.abrahamlay.kotlinmvvm.util

/**
 * Created by Abraham Lay on 2019-08-07.
 */
interface CalculateListener {
    fun onSuccess(result: String)
    fun onInput1Empty()
    fun onInput2Empty()
}