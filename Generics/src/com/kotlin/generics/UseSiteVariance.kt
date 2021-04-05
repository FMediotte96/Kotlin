package com.kotlin.generics

fun main() {
    val cars1 = mutableListOf(Car(), Car())
    val cars2: MutableList<Car> = mutableListOf()
    copyCars(cars1, cars2)

    val fords1 = mutableListOf(Ford(), Ford())
    val fords2: MutableList<Ford> = mutableListOf()
    copyCars(fords1, fords2) //this doesn't work because generics type are invariants

    copyCars(fords1, cars2) //T has to be the same for everything

    val cars3: MutableList<Car> = mutableListOf(Ford(), Ford())
}

open class Car {

}

//Using generics
//Use site variants covariance, we're making a parameter type covariant and we can do this when the implementation
//of a function meets the requirements for making something covariant or contravariant.
//This is also called type projection. A good use for this is when you're working with a third party class
//that's invariant and you want to write functions that use instances of the class in a covariant way
//Use site variants is equivalent to wildcards in Java
fun <T: Car> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    for (car in source) {
        destination.add(car)
    }
}

class Toyota : Car() {

}

class Ford : Car() {

}