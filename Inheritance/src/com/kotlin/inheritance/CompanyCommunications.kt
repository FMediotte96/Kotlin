package com.kotlin.inheritance

import java.time.Year

/*
    In Kotlin there's a way to declare a class and define an instance at the same time, and this is where the
    object keyword comes in. 3 typical use cases:

    - Singletons: we use it when we want one and only one instance of a class during the running of an application.
        We use the object keyword because there can only ever be one instance of an object class
    - Companion Objects
    - Object expressions
 */

fun main() {
    println(CompanyCommunications.getTagLIne()) //The first time we use it the object it'll create the instance
    println(CompanyCommunications.getCopyrightLine())
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLIne() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."
}