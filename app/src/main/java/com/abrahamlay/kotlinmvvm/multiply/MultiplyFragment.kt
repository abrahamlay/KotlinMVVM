package com.abrahamlay.kotlinmvvm.multiply

import android.view.View
import androidx.lifecycle.ViewModelProviders
import com.abrahamlay.kotlinmvvm.R
import com.abrahamlay.kotlinmvvm.add.AddFunctionInteractor
import com.abrahamlay.kotlinmvvm.add.AddFunctionViewModel
import com.abrahamlay.kotlinmvvm.base.CalculateFragment
import com.abrahamlay.kotlinmvvm.util.CalculateState
import com.abrahamlay.kotlinmvvm.util.ScreenState
import kotlinx.android.synthetic.main.fragment_calculate.*

/**
 * Created by Abraham Lay on 2019-08-07.
 */
class MultiplyFragment : CalculateFragment() {

    private lateinit var viewModel: MultiplyFunctionViewModel

    override fun initialization() {

        viewModel = ViewModelProviders.of(
            this,
            MultiplyFunctionViewModel.Factory(MultiplyFunctionInteractor())
        )[MultiplyFunctionViewModel::class.java]

        viewModel.calculateState.observe(::getLifecycle, ::updateUI)

        tv_title.text = getString(R.string.multiply_function)

        btn_submit.text = getString(R.string.multiply)
    }

    override fun calculate() {
        viewModel.onSubmitClicked(et_input_1.text.toString(), et_input_2.text.toString())
    }

}
