package com.kotlin.datatypes

import com.java.code.DummyClass
import java.math.BigDecimal

fun main() {

    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)

    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs1 is Array<Long>)
    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    println(longs1[2])

    val evenNumbers = Array(16) { i -> i * 2 }

    /*
    for (number in evenNumbers) {
        println(number)
    }*/

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeros = Array(100) { 0 }

    var someArray: Array<Int> = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }
    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for (element in mixedArray) {
        println(element)
    }

    println(mixedArray is Array<*>)

    /*  We it comes to array we can't just call Java methods that want primitive
       arrays without having to do anything special
       We should use the array subclass for the primitive type because we can't just use the array class.
       We have to use one of the special primitive array classes in Kotlin.
       There is IntArray, ByteArray, LongArray, CharArray
   */
    val myIntArray = intArrayOf(3, 9, 434, 2, 33)
    DummyClass().printNumbers(myIntArray)

    var someOtherArray = IntArray(5)
    for (number in someOtherArray) {
        println(number)
    }

    DummyClass().printNumbers(evenNumbers.toIntArray())

    //converted from special primitive array to the array class
    val convertedIntArray= myIntArray.toTypedArray()

}