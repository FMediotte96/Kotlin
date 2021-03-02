package com.kotlin.nullReferences

fun main() {
    //The non-null assertion !!
    val str4: String? = "This isn't null"
    val str5 = str4!!.toUpperCase()

    /* Let function
    what we're trying to accomplish the long way
        if(str4 != null) {
            printText(str4)
        }
    Here we're saying that if str isn't null, then let this function call go ahead
    We referred to the variable using the keyword it. Let needs as a parameter a lambda expression
    If str is null this wouldn't happen, but if str isn't null then the expression can go ahead
    */
    str4?.let { printText(it) }
    printText(str4)

    /*The non-null assertion is shorthand for
        if(str == null) {
            throw exception
        } else {
            str.toUpperCase()
        }
     */

    /*val str: String? = null
    val str2 = str!!
    val str3 = str2.toUpperCase()*/

    //we don't have to do the following because we will not be enable to determinate which variable is null
    //val countryCode = bankBranch!!.address!!.country!!

    val str6: String? = null
    val anotherStr = "This isn't nullable"
    //The == operator is a safe operator
    println(str4 == anotherStr)

    //Arrays and Null References
    val nullableInts = arrayOfNulls<Int>(5)
    for(i in nullableInts) {
        println(i)
    }

    println(nullableInts[3].toString())
}

fun printText(text: String) {
    println(text)
}