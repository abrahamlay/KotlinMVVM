package com.abrahamlay.kotlinmvvm.prime

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

/**
 * Created by Abraham Lay on 2019-08-08.
 */
class PrimeFunctionInteractorTest {

    lateinit var interactor: PrimeFunctionInteractor

    @Before
    fun setUp() {
        interactor = PrimeFunctionInteractor()
    }

    @Test
    fun test_PrimeNumberFunction1() {
        assertEquals("2, 3, 5, 7", interactor.primeFunction("4"))
    }

    @Test
    fun test_PrimeNumberFunction2() {
        assertEquals("2, 3, 5, 7, 11", interactor.primeFunction("5"))
    }

    @Test
    fun test_PrimeNumberFunction3() {
        assertEquals("2, 3, 5, 7, 11, 13", interactor.primeFunction("6"))
    }
}