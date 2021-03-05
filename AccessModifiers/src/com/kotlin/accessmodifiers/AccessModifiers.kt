package com.kotlin.accessmodifiers

fun main() {
    /*  In Kotlin the default visibility is public meaning that everything can see
        and access the class. There is no matching requirement between class names and file names,
        so you can have as many public classes as you want in a single Kotlin file.
        Also we can use private with classes which we can't do in Java
    */

    val emp = Employee();
    println(emp)

}

/*
    Kotlin also has the notion of a module which is a group of file thar are compiled together
    like out project AccessModifiers is a module but could be a group of file compiled by Gradle or Maven
    We can introduce now the access modifier internal which is visible inside the module, everything that
    belongs to the same module can see declarations that are marked as internal.

    In Kotlin, classes can't see private members belonging to inner classes
    Private is compiled to package private and internal is compiled to public
 */
private class Employee {

}