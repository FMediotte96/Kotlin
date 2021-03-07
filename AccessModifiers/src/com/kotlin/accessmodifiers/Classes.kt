package com.kotlin.accessmodifiers

fun main() {
    val car = Car("blue", "Toyota", 2015)
    println(car)
    val car2 = Car("blue", "Toyota", 2015)
    println(car == car2)

    val emp = Employee("John")
    println(emp)
    val emp2 = Employee("John")
    println(emp == emp2)

    //Structurally equal to car
    val car3 = car.copy()
    println(car3)

    //Keep the other values the same, but we can change assignments if we want in the copy function
    val car4 = car.copy(year = 2016, color = "green")
    println(car4)
}

/*
    Constants and Data Classes

    In Kotlin you can have top-level constants just as you can have top-level functions
    so you don't have to declare a class and fill it with constants

    Data Classes are a special type of class whose main purpose is to store state.
    Using data classes give us new functionality from Kotlin:
    - Nicer ToString function
    - Custom implementation of the equals
    - Hashcode functions
    - Copy function

    Data classes has to meet certain requirements:
    - The primary constructor has to have at least one parameter and all of those parameters has to be marked
      val or var
    - Can't be abstract, sealed or inner classes
*/
data class Car(val color: String, val model: String, val year: Int) {

}