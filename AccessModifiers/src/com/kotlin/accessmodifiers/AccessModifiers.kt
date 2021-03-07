package com.kotlin.accessmodifiers

fun main() {
    /*  In Kotlin the default visibility is public meaning that everything can see
        and access the class. There is no matching requirement between class names and file names,
        so you can have as many public classes as you want in a single Kotlin file.
        Also we can use private with classes which we can't do in Java
    */

    val emp = Employee("John");
    println(emp.firstName)

    val emp2 = Employee("Joe")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = Employee("Jane", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    println(Demo().dummy)

}

/*
    Kotlin also has the notion of a module which is a group of file that are compiled together
    like our project AccessModifiers is a module, but could be a group of file compiled by Gradle or Maven
    We can introduce now the access modifier internal which is visible inside the module, everything that
    belongs to the same module can see declarations that are marked as internal.

    In Kotlin, classes can't see private members belonging to inner classes
    Private is compiled to package private and internal is compiled to public

    Kotlin has the notion of primary constructor which is declared outside the curly braces
 */
//This is the long way to create a constructor and assign a value
/*class Employee constructor(firstName: String) {

    val firstName: String

    // Initializer block, it's used in conjunction with the primary constructor
    init {
        this.firstName = firstName
    }

}*/
//We can simplify the init block using one line as following
/*class Employee constructor(firstName: String) {

    val firstName: String = firstName

}*/

/* We can take this even further, Kotlin will generate boilerplate code for you by default under the covers
   It will declare properties with the same names as the parameters and it will assign the values past to those
   parameters to the properties
   We can remove the constructor keyword except if we had annotations or we were using Access Modifier like protected
 */
/*class Employee(val firstName: String) {

    var fullTime: Boolean = true

    //: this(firstName) will call primary constructor
    // We can double the parameter declaration as a property declaration but yoy can't
    // do the same thing in secondary constructor
    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }
}*/

/*
   Most of the time, you won't need a secondary constructor or you should be able to at least reduce the number that
   you need. We can assign a default value in our primary constructor. When we don't specify a fullTime value now
   instances will get the default of true. And when we do that value is used
*/
class Employee(val firstName: String, var fullTime: Boolean = true) {

}

// We can have secondary constructor even without a primary constructor
class Demo {
    val dummy: String

    constructor() {
        dummy = "Hello"
    }
}