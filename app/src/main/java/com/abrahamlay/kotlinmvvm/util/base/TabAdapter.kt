package com.abrahamlay.kotlinmvvm.util.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

/**
 * Created by Abraham Lay on 2019-08-07.
 */
class TabAdapter(private val items :List<Fragment>, private val titles : List<String>, fm: FragmentManager?) : FragmentStatePagerAdapter(fm) {
    override fun getItem(pos: Int): Fragment {
        return items[pos]
    }

    override fun getCount(): Int {
        return items.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }
}