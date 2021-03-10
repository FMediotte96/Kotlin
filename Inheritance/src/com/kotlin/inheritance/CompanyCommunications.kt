package com.kotlin.inheritance

import java.time.Year

/*
    In Kotlin there's a way to declare a class and define an instance at the same time, and this is where the
    object keyword comes in. 3 typical use cases:

    - Singletons: we use it when we want one and only one instance of a class during the running of an application.
        We use the object keyword because there can only ever be one instance of an object class
    - Companion Objects: allow you to access to them without and instance of the class.
        We can use them to call private constructors, in fact you can use them to implement the factory pattern.
    - Object expressions
 */

fun main() {
    println(CompanyCommunications.getTagLIne()) //The first time we use it the object it'll create the instance
    println(CompanyCommunications.getCopyrightLine())

    //Kotlin is actually smart enough to know that you want to call something in the companion object
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("This is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)
    println(someClass1.someString)
    println(someClass2.someString)
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLIne() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}

//In Kotlin the keyword 'static' so we cannot call functions and public static members, within classes
//without having an instance of the class
class SomeClass private constructor(val someString: String) {

    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if(lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }
}