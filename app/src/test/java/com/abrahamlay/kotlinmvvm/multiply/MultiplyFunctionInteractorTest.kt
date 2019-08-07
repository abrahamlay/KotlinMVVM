package com.abrahamlay.kotlinmvvm.multiply

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by Abraham Lay on 2019-08-08.
 */
class MultiplyFunctionInteractorTest{


    lateinit var interactor: MultiplyFunctionInteractor

    @Before
    fun setUp() {
        interactor = MultiplyFunctionInteractor()
    }

    @Test
    fun test_MultiplyFunction1() {
        assertEquals("12", interactor.multiplyFunction("4","3"))
    }

    @Test
    fun test_MultiplyFunction2() {
        assertEquals("20", interactor.multiplyFunction("5","4"))
    }

    @Test
    fun test_MultiplyFunction3() {
        assertEquals("24", interactor.multiplyFunction("6","4"))
    }
}