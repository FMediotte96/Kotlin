package com.kotlin.challenge1

fun main() {

    //Declare two immutable String variables called hello1 and hello2. Assign "Hello"
    //to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    //Using one line of code, test whether hello1 and hello2 are referentially equal
    //and print the result
    println("hello1 is referentially equal to hello2:  ${hello1 === hello2}")
    //JVM looks in the String pool and reuses that's why the result is true

    //Do the same thing as above, but test for structural equality
    println("hello1 is structurally equal to hello2:  ${hello1 == hello2}")

    //Declare a mutable variable of type Int and assign it the value of 2988
    var number = 2988

    //Declare an immutable variable of type Any and assign it the String "The Any type
    // is the root of the Kotlin class hierarchy". Then, using a smart cast, print out
    // uppercase string
    val text: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (text is String) {
        println(text.toUpperCase())
    }

    //Using one line of code, print out the following. Make sure your is nicely indented
    //    1
    //   11
    //  111
    // 1111
    println("""   1
              |  11
              | 111
              |1111""".trimMargin())
}