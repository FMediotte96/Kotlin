package com.kotlin.ifexpression

//In Kotlin if can evaluate to a value this means that the if expression can return a value,
//that's why we don't need the ternary operator in Kotlin
fun main() {

    /*var num: Int
    if (someCondition) {
        num = 50
    } else {
        num = 952
    }
    num = someCondition ? 50 : 592*/

    val someCondition = 20 < 22

    //val num = if (someCondition) 50 else 592

    //We want to use if as an expression, you have to provide both an if and an else there
    //has to be some value, you need both branches
    println("The result of the if expression is ${if (someCondition) {
        println("something")
        50
    } else {
        println("something else")
        592
    }}")

    val x = if (someCondition) {
        println("something")
    } else {
        println("something else")
    }

    println(x.javaClass) //This give us which type is the variable
}