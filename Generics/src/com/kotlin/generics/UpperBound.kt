package com.kotlin.generics

import java.lang.StringBuilder

fun main() {
    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float?> = listOf(100.3f, -459.43f)
    val strings = listOf("1", "2", "3") //non-nullable

    //convertToInt(floats)
    //convertToInt(shorts)
    //convertToInt(strings) we can't do this because don't match the upper bound

    append(StringBuilder("String 1"), StringBuilder("String 2"))

    //Nullable types
    //printCollection(shorts)
    printCollection(strings)

    //The JVM doesn't see the generic type
    //In Kotlin we can use is with generics
    if (strings is List<String>) {
        println("This list contains strings")
    }

    var listAny: Any = listOf("st1", "str2")
    if (listAny is List<*>) {
        //Cannot check for instance of erased type: List<String>
        println("Yes, this is a list. Thank you star projection!")
    }

    //The star projection syntax <*>
    //listAny = listOf(1, 2, 3)
    if (listAny is List<*>) {
        println("This list contains strings")
        val strList = listAny as List<String> //unchecked cast
        println(strList[1].replace("str", "string"))
    }

}

//To limit print collection to only non nullable types
fun <T : Any> printCollection(collection: List<T>) {
    for (item in collection) {
        println(item)
    }
}

//More than one upper bound, we have to use de where keyword
fun <T> append(item1: T, item2: T)
        where T : CharSequence, T : Appendable {
    println("Result is ${item1.append(item2)}")
}

//In Kotlin we can use type parameter constraints to limit what types can be used for a generic type
//When you don't specify an upper bound the upper bound is actually is Any?
fun <T : Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}