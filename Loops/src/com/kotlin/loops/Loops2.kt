package com.kotlin.loops

fun main() {
    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) {
        println(season)
    }

    //Arrays also have an extension function that makes them easy to iterate over.
    //Index within the for block
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }

    //The is also a not in operator
    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    val str = "Hello"
    println('e' in str)
    println('e' !in str)

    //We can also use the forEach statement
    //Inside a lambda expression we refer to each value using it
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    //We can give them a name
    //Nested for loop
    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) { //we are giving a name to this loop
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
                    break@jloop //We have breaking outside jloop, we can also use this with continue
                }
            }
        }
    }

}