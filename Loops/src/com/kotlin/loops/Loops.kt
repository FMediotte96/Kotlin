package com.kotlin.loops

fun main() {

    //Range: interval that has a start and an end value, you can use them with the for loop
    //and you can also assign them to variables. The range operator is the two dots (..), the start
    //and end values are inclusive
    val range = 1..5
    for (i in range) {
        println(i)
    }

    //step without assign it to a variable
    for (num in 1..20 step 4) {
        println(num)
    }

    //We can combine functions
    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    /*val s = "goodbye"
    val sRange = 0..s.length*/

    //Until
    for (i in 1 until 10) {
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ"
    val str = "Hello"
    for(c in str) {
        println(c)
    }

    //The type we used in a range has to be comparable because of you
    //use the in operator to test whether the value is in a range
    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val r = 5..1
    println(5 in r) // This isn't work because is comparing >= to the start value (5) and <= to the end value(1)
    // We have to go this way
    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    for (n in stepThree) {
        println(n)
    }
    // This only work with IntRanges
    val reversedRange = range.reversed()
    for (i in reversedRange) {
        println(i)
    }
}

