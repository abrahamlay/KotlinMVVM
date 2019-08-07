package com.abrahamlay.kotlinmvvm.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abrahamlay.kotlinmvvm.R
import kotlinx.android.synthetic.main.fragment_calculate.*

/**
 * Created by Abraham Lay on 2019-08-07.
 */
open abstract class CalculateFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_calculate, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialization()
        btn_submit.setOnClickListener { calculate() }
    }

    abstract fun initialization()

    abstract fun calculate()

}