package com.abrahamlay.kotlinmvvm.util

import android.os.Handler

/**
 * Created by Abraham Lay on 2019-08-07.
 */

fun postDelayed(delayMillis: Long, task: () -> Unit) {
    Handler().postDelayed(task, delayMillis)
}