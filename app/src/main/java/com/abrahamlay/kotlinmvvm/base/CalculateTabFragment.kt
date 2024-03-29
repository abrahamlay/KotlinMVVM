package com.abrahamlay.kotlinmvvm.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abrahamlay.kotlinmvvm.R
import kotlinx.android.synthetic.main.fragment_tab.*
import java.util.ArrayList

/**
 * Created by Abraham Lay on 2019-08-07.
 */
abstract class CalculateTabFragment : Fragment() {


    private var adapter: TabAdapter? = null
    protected lateinit var titles: ArrayList<String>
    protected lateinit var fragments: ArrayList<Fragment>
    protected abstract fun initFragmentAndTitle()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tab, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fragments = ArrayList()
        titles = ArrayList()

        initFragmentAndTitle()
        initTabAndPager()
    }

    private fun initTabAndPager() {
        if (isAdded) {
            adapter = TabAdapter(fragments, titles, childFragmentManager)
            pager.adapter = adapter
            pager.offscreenPageLimit = fragments.size
        }
    }

}