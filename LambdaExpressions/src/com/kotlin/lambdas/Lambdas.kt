package com.kotlin.lambdas

fun main() {
    //We can call Lambdas directly using the run function
//    run { println("I'm in a lambda!") }
    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    //who works the longest
    //you can move the lambda outside the parentheses when it's the last parameter in the function call
    //the compiler can infer the type but not always
    //when there is only one parameter and the compiler can infer it we can use it
    println(employees.minByOrNull { it.startYear })

    //We can use a member reference in place of a lambda expression when all the lambda
    //does is access a property or when it calls a top-level function that doesn't take any parameters
    println(employees.minByOrNull(Employee::startYear))

    //We can access a mutable variable within lambda, this difference from Java where
    //we can only access final local variables within lambdas
    //The variable has to be before the lambda
    var num = 10
    run {
        num += 15
        println(num)
    }

    //We use de double colon (::) because is a top level function
    run(::topLevel)
}

fun topLevel() = println("I'm in a function!")

fun useParameter(employees: List<Employee>, num:Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}