@file:JvmName("StaticCar")
//We're telling the compiler you know that static class you're going to generate under the covers
//for us for all of our top level members we'll call that class StaticCar

package com.kotlincode

import java.io.IOException

fun topLevel() = println("I'm in the Car file")

//This now tells the compiler to generate code that will inform anything that's using this function
@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

fun main() {
    "Print this".print()
    Car.carComp()
}

//When we declare this Kotlin generate only one version of the function and the version it generates
//requires both parameters, for avoiding this we have to use @JvmOverloads
@JvmOverloads fun defaultArgs(str: String, num: Int = 25) {

}

object SingletonObj {
    @JvmStatic
    fun doSomething() = println("I'm doing something in the singleton object")
}

//@JvmField allows as to access model with a .
//You can't use it with private properties, with a property that overrides another property
//or a property that can be override or with a constant property that uses the const keyword
class Car(val color: String, @JvmField val model: String, val year: Int) {

    companion object {
        const val constant = 25 //constant is an exception to the rule
        @JvmField val isAuto = false

        @JvmStatic
        fun carComp() = println("I'm in car companion object")
    }

    //This generate a null-check under the covers
    fun printMe(text: String) {
        println("I don't expect a null value: $text")
    }

//    var color: String = color
//    private set(value) {
//        field = "always green"
//    }
}

fun String.print() {
    println(this)
}