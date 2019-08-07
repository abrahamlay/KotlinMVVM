package com.abrahamlay.kotlinmvvm.prime

import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.abrahamlay.kotlinmvvm.R
import com.abrahamlay.kotlinmvvm.base.CalculateFragment
import com.abrahamlay.kotlinmvvm.util.CalculateState
import com.abrahamlay.kotlinmvvm.util.ScreenState
import kotlinx.android.synthetic.main.fragment_calculate.*

/**
 * Created by Abraham Lay on 2019-08-07.
 */
class PrimeFragment : CalculateFragment() {

    private lateinit var viewModel: PrimeFunctionViewModel

    override fun initialization() {

        viewModel = ViewModelProviders.of(
            this,
            PrimeFunctionViewModel.Factory(PrimeFunctionInteractor())
        )[PrimeFunctionViewModel::class.java]

        viewModel.calculateState.observe(::getLifecycle, ::updateUI)

        tv_title.text = getString(R.string.prime_function)

        btn_submit.text = getString(R.string.prime_number)

        et_input_2.visibility = View.GONE
    }

    private fun updateUI(screenState: ScreenState<CalculateState>?) {
        when (screenState) {
            ScreenState.Loading -> progressBar.visibility = View.VISIBLE
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

    override fun calculate() {
        viewModel.onSubmitClicked(et_input_1.text.toString())
    }

}