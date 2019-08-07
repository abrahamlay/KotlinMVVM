package com.abrahamlay.kotlinmvvm.fibonnaci

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.abrahamlay.kotlinmvvm.util.CalculateListener
import com.abrahamlay.kotlinmvvm.util.CalculateState
import com.abrahamlay.kotlinmvvm.util.ScreenState

/**
 * Created by Abraham Lay on 2019-08-07.
 */

class FibonacciFunctionViewModel(private val interactor: FibonacciFunctionInteractor) : ViewModel(), CalculateListener {


    private val _calculateState: MutableLiveData<ScreenState<CalculateState>> = MutableLiveData()

    val calculateState: LiveData<ScreenState<CalculateState>> get() = _calculateState

    fun onSubmitClicked(input1: String) {
        _calculateState.value = ScreenState.Loading
        interactor.calculate(input1, this)
    }

    override fun onSuccess(result: String) {
        _calculateState.value = ScreenState.Render(CalculateState.SuccessCalculate(result))
    }

    override fun onInput1Empty() {
        _calculateState.value = ScreenState.Render(CalculateState.Input1Empty())
    }

    override fun onInput2Empty() {
        _calculateState.value = ScreenState.Render(CalculateState.Input2Empty())
    }

    class Factory(private val addFunctionInteractor: FibonacciFunctionInteractor) :
        ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return FibonacciFunctionViewModel(addFunctionInteractor) as T
        }
    }
}