package com.abrahamlay.kotlinmvvm.main

import com.abrahamlay.kotlinmvvm.R
import com.abrahamlay.kotlinmvvm.add.AddFragment
import com.abrahamlay.kotlinmvvm.fibonnaci.FibonnaciFragment
import com.abrahamlay.kotlinmvvm.multiply.MultiplyFragment
import com.abrahamlay.kotlinmvvm.prime.PrimeFragment
import com.abrahamlay.kotlinmvvm.util.base.BaseTabFragment

/**
 * Created by Abraham Lay on 2019-08-07.
 */
class MainTabFragment : BaseTabFragment() {
    override fun initFragmentAndTitle() {
        titles.add(getString(R.string.add))
        titles.add(getString(R.string.multiply))
        titles.add(getString(R.string.prime))
        titles.add(getString(R.string.fibonacci))
        fragments.add(AddFragment())
        fragments.add(MultiplyFragment())
        fragments.add(PrimeFragment())
        fragments.add(FibonnaciFragment())
    }
}