package com.kotlin.lambdas

import java.lang.StringBuilder

fun main() {

    println(countTo100())

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002)
    )

    findByLastNameLabel(employees, "Wilson")
    findByLastNameLabel(employees, "Smithson")

    //Label apply block
    "Some String".apply someString@ {
        "Another String".apply {
            println(toLowerCase()) //this refers to "Another String" instance
            println(this@someString.toUpperCase())
        }
    }
}

//You can only use this type of return when the function that is taking the lambda is inline
fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach {
        if (it.lastName == lastName) { //forEach is inline
            println("Yes, there's an employee with the last name $lastName")
            //this return statement it's returning from the lambda and the function.
            //It's call a non-local return
            return
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}

fun findByLastNameLabel(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) { //forEach is inline
            println("Yes, there's an employee with the last name $lastName")
            //This is a local return because we had labeled the lambda
            return@returnBlock
        }
    }
    println("Nope, there's no employee with the last name $lastName")
}

/*
    We can perform this using the with function, we have to pass an instance and the lambda to the function
    and within the lambda you don't have to refer to the instance when you want to call one of its member functions,
    we can just call the member functions without having to invoke them using the instance
*/
/*fun countTo100(): String {
    val numbers = StringBuilder()
    for(i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}*/

//with convert the instance that you pass to it into a receiver and inside the lambda, you
//don't have to refer to the receiver object
/*fun countTo100() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }*/

/*
    Apply function: works the same way as with but it always returns the receiver object.
    So in our case instead of using with and calling toString within the lambda we can
    use apply and apply will return the StringBuilder and the we'll call toString on the StringBuilder
 */
fun countTo100() =
    StringBuilder().apply {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()