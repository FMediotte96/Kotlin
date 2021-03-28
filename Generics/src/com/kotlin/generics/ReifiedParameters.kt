package com.kotlin.generics

import java.math.BigDecimal

fun main() {
    //we include BigDecimal between <> because we have to tall the compiler what type we want back
    //when you have a T in the return type
    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-5938.393849))
    val bigDecimalOnly = getElementsOfType<String>(mixedList)
    for (item in bigDecimalOnly) {
        println(item)
    }
}

//inline function we said that one scenario that benefits from inline functions is when the function has a lambda as a parameter.
//Another scenario is when they have a generic type as a parameter because inline function parameters can be
//what's called reified. Reification is a Kotlin feature that prevents the type from being erased at runtime
//If we declare a function as inline and a type parameter as a reified then you can check the generic type as runtime
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) { //Cannot check for instance of erased type: T the jvm has no clue what t is
            newList.add(element)
        }
    }
    return newList;
}
/*You'd want to do this sort of thing when you need to check the type within a function. Otherwise
there's absolutely no reason to use reification
You can't mark classes properties or non inline functions as reified*/
