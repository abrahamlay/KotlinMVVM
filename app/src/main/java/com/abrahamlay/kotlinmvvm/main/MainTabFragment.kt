package com.abrahamlay.kotlinmvvm.main

import com.abrahamlay.kotlinmvvm.R
import com.abrahamlay.kotlinmvvm.add.AddFunctionFragment
import com.abrahamlay.kotlinmvvm.fibonnaci.FibonnaciFragment
import com.abrahamlay.kotlinmvvm.multiply.MultiplyFragment
import com.abrahamlay.kotlinmvvm.prime.PrimeFragment
import com.abrahamlay.kotlinmvvm.base.CalculateTabFragment

/**
 * Created by Abraham Lay on 2019-08-07.
 */
class MainTabFragment : CalculateTabFragment() {
    override fun initFragmentAndTitle() {
        titles.add(getString(R.string.add))
        titles.add(getString(R.string.multiply))
        titles.add(getString(R.string.prime_number))
        titles.add(getString(R.string.fibonacci_number))
        fragments.add(AddFunctionFragment())
        fragments.add(MultiplyFragment())
        fragments.add(PrimeFragment())
        fragments.add(FibonnaciFragment())
    }
}