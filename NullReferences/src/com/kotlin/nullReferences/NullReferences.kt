package com.kotlin.nullReferences

fun main() {

    // if you want a variable to be able to contain null you have to explicitly tell the compiler
    // that by following the type name with a question mark
    val str: String? = null
    // with this question mark, we're saying this could be null, and if the check null passed then call
    // toUpperCase method
    println("What happens when we do this: ${str?.toUpperCase()}")
    // when you have a safe operator expression if the variable is null, the expression evaluates to null
    // if isn't null then the expression go ahead and runs

    /*
        This way is a shorthand for
        if(str == null) {
            null
        } else {
            str.toUpperCase()
        }
     */

    // The Elvis operator ?:
    // it lets you assign a default value when an expression evaluates to null
    val str2 = str ?: "This is the default value"
    println(str2)

    //Safe cast operator as?
    // if it turns out that you can't perform the cast successfully, the cast evaluates to null
    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 = something as? String
    println(str3)
    println(str3?.toUpperCase())

}