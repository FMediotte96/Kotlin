package com.kotlin.anotherpackage

import com.kotlin.inheritance.topLevel
import com.kotlin.inheritance.upperFirstAndLast

fun main() {
    //This module can't see the top level function because we haven't added the company
    //communications module as a dependency
    topLevel("Hello from another module")
    println("a string to work with".upperFirstAndLast())
}