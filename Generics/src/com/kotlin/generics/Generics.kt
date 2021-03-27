package com.kotlin.generics

import java.math.BigDecimal

fun main() {
    //In kotlin we have to use the generics
    val list = mutableListOf("Hello")
    list.add("another string")
    list.printCollection()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
    bdList.printCollection()
}

//We put the T's to indicate this functions is using generics
//<T> the fun keyword is called the type parameter declaration
fun <T> List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}