package com.kotlin.accessmodifiers

val MY_CONSTANT = 100 //constant int

fun main() {
    /*  In Kotlin the default visibility is public meaning that everything can see
        and access the class. There is no matching requirement between class names and file names,
        so you can have as many public classes as you want in a single Kotlin file.
        Also we can use private with classes which we can't do in Java
    */

    println(MY_CONSTANT)

    val emp = Employee("John");
    println(emp.firstName)
    //Under the covers this is calling the getter and setters
    emp.fullTime = false
    println(emp.fullTime)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)

}

// We can have secondary constructor even without a primary constructor
class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}

class Employee(val firstName: String, fullTime: Boolean = true) {

    //Custom getter and setter has to come immediately after the property declaration
    var fullTime = fullTime
    get() {
        println("Running the custom get")
        return field //we have to refer the backing field using the field identifier
    }
    set(value) {
        println("Running the custom set")
        field = value
    }

}

