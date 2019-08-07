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

    override fun calculate() {
        viewModel.onSubmitClicked(et_input_1.text.toString())
    }

}