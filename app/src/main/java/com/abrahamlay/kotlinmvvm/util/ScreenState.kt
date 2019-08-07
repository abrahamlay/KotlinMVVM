package com.abrahamlay.kotlinmvvm.util

/**
 * Created by Abraham Lay on 2019-08-07.
 */

sealed class ScreenState<out T> {
    object Loading : ScreenState<Nothing>()
    class Render<T>(val renderState: T) : ScreenState<T>()
}