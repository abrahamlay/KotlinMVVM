package com.abrahamlay.kotlinmvvm.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.abrahamlay.kotlinmvvm.R
import com.abrahamlay.kotlinmvvm.util.CalculateState
import com.abrahamlay.kotlinmvvm.util.ScreenState
import kotlinx.android.synthetic.main.fragment_calculate.*

/**
 * Created by Abraham Lay on 2019-08-07.
 */
abstract class CalculateFragment : Fragment() {

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

    protected fun updateUI(screenState: ScreenState<CalculateState>?) {
        when (screenState) {
            ScreenState.Loading -> {
                progressBar.visibility = View.VISIBLE
                tv_result.text = ""
            }
            is ScreenState.Render -> calculatingState(screenState.renderState)
        }
    }

    private fun calculatingState(calculateState: CalculateState) {
        progressBar.visibility = View.GONE
        when (calculateState) {
            is CalculateState.SuccessCalculate -> tv_result.text = calculateState.result
            is CalculateState.Input1Empty -> et_input_1.error = getString(R.string.input_1_empty)
            is CalculateState.Input2Empty -> et_input_2.error = getString(R.string.input_2_empty)
        }
    }

}