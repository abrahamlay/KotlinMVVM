package com.abrahamlay.kotlinmvvm.add

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

/**
 * Created by Abraham Lay on 2019-08-08.
 */
class AddFunctionInteractorTest {
    lateinit var interactor: AddFunctionInteractor

    @Before
    fun setUp() {
        interactor = AddFunctionInteractor()
    }

    @Test
    fun test_MultiplyFunction1() {
        assertEquals("7", interactor.addFunction("4", "3"))
    }

    @Test
    fun test_MultiplyFunction2() {
        assertEquals("9", interactor.addFunction("5", "4"))
    }

    @Test
    fun test_MultiplyFunction3() {
        assertEquals("10", interactor.addFunction("6", "4"))
    }
}