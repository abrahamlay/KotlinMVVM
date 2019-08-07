package com.abrahamlay.kotlinmvvm.main

import android.os.Bundle
import com.abrahamlay.kotlinmvvm.R
import com.abrahamlay.kotlinmvvm.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(R.id.container, MainTabFragment(), false)
    }
}
