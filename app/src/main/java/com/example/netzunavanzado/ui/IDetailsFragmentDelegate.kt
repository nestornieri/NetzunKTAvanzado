package com.example.netzunavanzado.ui

import java.io.Serializable

interface IDetailsFragmentDelegate:Serializable {
    fun onSomething1(someData1: String)
    fun onSomething2(someData2: String)
}