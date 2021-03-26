package com.kotlin.collections

fun main() {

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf<String, Car>(
        "John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012)
    )

    println(mutableMap.javaClass)
    println(mutableMap)
    //mutableMap.put("Mary's car", Car("red", "Corvette", 1965))
    mutableMap["Mary's car"] = Car("red", "Corvette", 1965) //Kotlin suggest this

    //In both cases the compiler instances a LinkedHasMap, because Kotlin likes to have HashMap
    //cause they have a predictable iteration order and Kotlin wants this so that you can easily convert
    //from a list to a set to a map. We can instance a HashMap using hashMapOf


    val pair = Pair(10, "ten")
    //val firstValue = pair.first
    //val secondVale = pair.second
    //We can replace this for:
    //This line is called a destructuring declaration. We've distributed the public member values to different variables
    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)

    //Destructuring Maps
    //If you want to be able to destruct a class in this way you have to implement what's
    //called component functions and both the pair class and the map entry class have
    //implemented these functions
    for ((k, v) in mutableMap) {
        println(k)
        println(v)
    }

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color = $color, model = $model and year = $year")

}

//The properties have to be public to do this
//We don't have to explicitly write the component end functions for data classes
data class Car(val color: String, val model: String, val year: Int) {
    //implementing component functions
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
}