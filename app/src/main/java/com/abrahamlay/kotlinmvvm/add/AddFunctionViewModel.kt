package com.abrahamlay.kotlinmvvm.add

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

class AddFunctionViewModel(private val interactor: AddFunctionInteractor) : ViewModel(), CalculateListener {


    private val _calculateState: MutableLiveData<ScreenState<CalculateState>> = MutableLiveData()

    val calculateState: LiveData<ScreenState<CalculateState>> get() = _calculateState

    fun onSubmitClicked(input1: String, input2: String) {
        _calculateState.value = ScreenState.Loading
        interactor.calculate(input1, input2, this)
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

    class Factory(private val addFunctionInteractor: AddFunctionInteractor) :
        ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return AddFunctionViewModel(addFunctionInteractor) as T
        }
    }
}