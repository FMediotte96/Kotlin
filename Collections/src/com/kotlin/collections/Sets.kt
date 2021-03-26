package com.kotlin.collections

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20)) //Add an element into the set
    println(setInts.plus(10)) //Set can contain
    //This set is immutable
    println(setInts.minus(19)) //delete one element
    println(setInts.minus(100))
    println(setInts.average()) //Average
    println(setInts.drop(3)) //This remove the first 3 elements from the set

    //Mutable set
    val mutableInts = mutableSetOf(1, 2, 3, 4, 5)
    //This actually returns a different Set not changing the original, the same happen with minus
    mutableInts.plus(10)
    println(mutableInts)
    mutableInts.add(10) //This line add a new element
    println(mutableInts)
    mutableInts.remove(10) //This line remove an element
    println(mutableInts)
}