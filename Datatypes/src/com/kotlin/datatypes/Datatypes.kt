package com.kotlin.datatypes

import com.java.code.DummyClass

fun main() {
    val myInt = 10
    println("default datatype is ${myInt is Int}")
    var myLong = 22L //L is use for declare a long value

    //Kotlin doesn't automatically widen numbers
    /*  This works in Java
        int myInt = 10;
        long myLong = myInt;
     */

    /* This is not permitted in Kotlin
        myLong = myInt
        Every datatype has two functions that convert to the other data types:
     */
    myLong = myInt.toLong()

    val myByte: Byte = 11
    var myShort: Short

    myShort = myByte.toShort()

    /*  There is one exception to this and that is numeric literals. Kotlin will
        automatically widen literals
     */
    val anotherInt = 5

    //Double
    var myDouble = 65.984
    println(myDouble is Double)

    //Float
    val myFloat = 838.8492f
    println("This is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    //char
    var char = 'b'
    //val myChar:Char = 65  //you can't assign the ascii code to a char variable
    //we cannot treat characters like numbers in Kotlin
    val myCharInt = 65
    println(myCharInt.toChar())

    //boolean
    val myBoolean = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    /**
     * Any, Unit and Nothing classes are important classes in Kotlin.
     *
     * - Any: is sort of like the object class in Java, it's the root of every Kotlin object,
     *  it includes function definitions for toString, hashcode and equals
     * - Unit: is equivalent to void in Java, that is a way of telling the compiler that a method
     *  doesn't return anything. Kotlin uses the unit class for this purpose, and returns the singleton
     *  unit instance
     * - Nothing: is a subclass of every class, which means that you can use nothing wherever you can use any class.
     *  One common use case would be when you know a function is never going to return
     *
     */
    val anything: Any
}
