package com.example.mockitioproject

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorTest {
    @Mock
    lateinit var operator: Operators
    private lateinit var calculator: Calculator

    @Before
    fun onSetup() {
        calculator = Calculator(operator)
    }

    @Test
    fun givenValidInput_whenAdd_shouldCallAddOperator() {
        val a = 10
        val b = 20
        calculator.addTwoNumbers(a, b)
        verify(operator).add(a,b)


    }

    @Test
    fun givenInValidInput_whenAdd_shouldCallAddOperator() {
        val a = 0
        val b = -10
        calculator.addTwoNumbers(a, b)
        verify(operator).add(a, b)
    }

    @Test
    fun givenTwoNegativeInput_whenAdd_shouldCallAddOperator() {
        val a = -20
        val b = -10
        calculator.addTwoNumbers(a, b)
        verify(operator).add(a, b)

    }

    @Test
    fun givenTwoZeroInput_whenAdd_shouldCallAddOperator() {
        val a = 0
        val b = 0
        calculator.addTwoNumbers(a, b)
        verify(operator).add(a, b)

    }

    @Test
    fun givenValidInput_whenSubtract_shouldCallSubtractOperator() {
        val a = 10
        val b = 20
        calculator.subtractTwoNumbers(a, b)
        verify(operator).subtract(a, b)

    }

    @Test
    fun givenNegativeAInput_whenSubtract_shouldCallSubtractOperator() {
        val a = -10
        val b = 20
        calculator.subtractTwoNumbers(a, b)
        verify(operator).subtract(a, b)

    }

    @Test
    fun givenNegativeBInput_whenSubtract_shouldCallSubtractOperator() {
        val a = 10
        val b = -20
        calculator.subtractTwoNumbers(a, b)
        verify(operator).subtract(a, b)

    }

    @Test
    fun givenBothNegativeInput_whenSubtract_shouldCallSubtractOperator() {
        val a = -10
        val b = -20
        calculator.subtractTwoNumbers(a, b)
        verify(operator).subtract(a, b)

    }

    @Test
    fun givenBotZeroInput_whenSubtract_shouldCallSubtractOperator() {
        val a = 0
        val b = 0
        calculator.subtractTwoNumbers(a, b)
        verify(operator).subtract(a, b)

    }

    @Test
    fun givenValidInput_whenMultiply_shouldCallMultiplyOperator() {
        val a = 10
        val b = 20
        calculator.multiplyTwoNumbers(a, b)
        verify(operator).multiply(a, b)


    }

    @Test
    fun givenNegativeInput_whenMultiply_shouldCallMultiplyOperator() {
        val a = -10
        val b = -20
        calculator.multiplyTwoNumbers(a, b)
        verify(operator).multiply(a, b)
    }

    @Test
    fun givenOneInput_whenMultiply_shouldCallMultiplyOperator() {
        val a = -10
        val b = 20
        calculator.multiplyTwoNumbers(a, b)
        verify(operator).multiply(a, b)
    }

    @Test
    fun givenValidInput_whenDivide_shouldCallDivideOperator() {
        val a = 10
        val b = 20
        calculator.divideTwoNumbers(a, b)
        verify(operator).divide(a, b)

    }

    @Test
    fun givenAZInput_whenDivide_shouldCallDivideOperator() {
        val a = 0
        val b = 20
        calculator.divideTwoNumbers(a, b)
        verify(operator).divide(a, b)

    }

    @Test
    fun givenBZInput_whenDivide_shouldCallDivideOperator() {
        val a = 10
        val b = 0
        calculator.divideTwoNumbers(a, b)
        verify(operator).divide(a, b)

    }

    @Test
    fun givenBothZInput_whenDivide_shouldCallDivideOperator() {
        val a = 0
        val b = 0
        calculator.divideTwoNumbers(a, b)
        verify(operator).divide(a, b)

    }

}