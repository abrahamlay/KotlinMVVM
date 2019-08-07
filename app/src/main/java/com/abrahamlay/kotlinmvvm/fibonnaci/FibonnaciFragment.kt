package com.abrahamlay.kotlinmvvm.fibonnaci

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
class FibonnaciFragment : CalculateFragment() {
    private lateinit var viewModel: FibonacciFunctionViewModel

    override fun initialization() {

        viewModel = ViewModelProviders.of(
            this,
            FibonacciFunctionViewModel.Factory(FibonacciFunctionInteractor())
        )[FibonacciFunctionViewModel::class.java]

        viewModel.calculateState.observe(::getLifecycle, ::updateUI)

        tv_title.text = getString(R.string.fibonacci_function)

        btn_submit.text = getString(R.string.fibonacci_function)

        et_input_2.visibility = View.GONE
    }

    override fun calculate() {
        viewModel.onSubmitClicked(et_input_1.text.toString())
    }
}