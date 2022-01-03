package com.example.mockitioproject

import android.util.Log

object Operators {

    fun add(a: Int, b: Int): Int {
        Log.d("res", (a+b).toString())
        return a + b
    }

    fun subtract(a: Int, b: Int): Int = a - b

    fun multiply(a: Int, b: Int): Int = a * b

    fun divide(a: Int, b: Int): Int = a / b
}