package com.kotlin.collections

fun main() {

    //When we are working with an immutable instance we can add and remove items but
    //the result will be a brand new instance
    //All the collections take a generic type and all the read only interfaces are covariant
    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass)
    //you can't add or remove anything from this type of list but you can change one of the elements.
    //This is actually a mutable list. Kotlin makes it immutable by not having any functions in
    //the calling list interface that can change the array list
    //When we say that a collection is immutable we mean that it's guaranteed to be immutable from Kotlin

    //EmptyList
    val emptyList = emptyList<String>()
    println(emptyList.javaClass)

    if (emptyList.isNotEmpty()) {
        println(emptyList[0])
    }

    //NotNullList
    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    //Arraylist
    val arraylist = arrayListOf(1, 2, 4)
    println(arraylist.javaClass)

    val mutableList = mutableListOf<Int>(1, 2, 3)
    println(mutableList.javaClass)

    //We can use the square bracket notation almost as if this was an array
    println(mutableList[2])
    mutableList[1] = 20
    println(mutableList)

    val array = arrayOf("black", "white", "green")
    val colorList = array.toList() //Spread operator or this method
    println(colorList)

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())

}