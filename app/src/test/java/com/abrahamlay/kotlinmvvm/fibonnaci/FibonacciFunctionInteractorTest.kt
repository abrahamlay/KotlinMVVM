package com.abrahamlay.kotlinmvvm.fibonnaci

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by Abraham Lay on 2019-08-08.
 */
class FibonacciFunctionInteractorTest {

    lateinit var interactor: FibonacciFunctionInteractor

    @Before
    fun setUp() {
        interactor = FibonacciFunctionInteractor()
    }

    @Test
    fun test_FibonacciNumberFunction1() {
        assertEquals("0, 1, 1, 2", interactor.fibonacciFunction("4"))
    }

    @Test
    fun test_FibonacciNumberFunction2() {
        assertEquals("0, 1, 1, 2, 3", interactor.fibonacciFunction("5"))
    }

    @Test
    fun test_FibonacciNumberFunction3() {
        assertEquals("0, 1, 1, 2, 3, 5", interactor.fibonacciFunction("6"))
    }
}