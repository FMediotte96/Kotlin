package com.kotlin.trycatch

import java.lang.IllegalArgumentException

//Kotlin doesn't distinguish between checked and unchecked exceptions
fun main() {
//    println(getNumber("22.5") ?: "I can't print the result")
    notImplementedYet("string")
}

//The last line in each block will be the value that the try-catch returns
//The finally block is not involved in the evaluation of the value of a try-catch expression
//If an exception is thrown and we don't catch it there nothing gets returned
fun getNumber(str: String): Int? {
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("I'm in the finally block")
    }
}

//This is another use case for the nothing type
fun notImplementedYet(something: String): Nothing {
    throw IllegalArgumentException("Implement me!")
}