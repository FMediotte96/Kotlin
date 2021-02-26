package com.kotlin.declarations

typealias EmployeeSet = Set<Employee>

fun main() {
    val number = 25 //immutable is equivalent to final in Java

    //Other way to say to the compiler that we want an int value
    var number2: Int //var means mutable and the compile will underline the variable

    //Cases when we have to include both, for example to define a short value
    val number3: Short = 25

    number2 = 10
    number2 = 20

    val employees: EmployeeSet

    //Kotlin recommend as a good practice using val whenever it possible

    val employee1 = Employee("Facundo", 1);
    employee1.name = "Fernando"

    val employee2: Employee
    val number4 = 100

    if (number < number4) {
        employee2 = Employee("Jane", 4)
    } else {
        employee2 = Employee("Mike", 5)
    }

}

class Employee(var name: String, val id: Int) {

}