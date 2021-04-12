@file:JvmName("StaticCar")
//We're telling the compiler you know that static class you're going to generate under the covers
//for us for all of our top level members we'll call that class StaticCar

package com.kotlincode

fun topLevel() = println("I'm in the Car file")

fun main() {
    "Print this".print()
}

//@JvmField allows as to access model with a .
//You can't use it with private properties, with a property that overrides another property
//or a property that can be override or with a constant property that uses the const keyword
class Car(val color: String, @JvmField val model: String, val year: Int) {
//    var color: String = color
//    private set(value) {
//        field = "always green"
//    }
}

fun String.print() {
    println(this)
}