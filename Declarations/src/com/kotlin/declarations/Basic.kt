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

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    //Equality in Kotlin
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    //to checking for referential equality we have to use the triple equal operator (===)
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)

    println(employeeOne == employeeTwo)
    //this with return true because the equal operator is checking for structural equality
    println(employeeTwo == employeeThree)

    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)

    //not equals
    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)


    //Bit Operators and Smart Casting
    val x = 0x00101101
    val y = 0x11011011

    //don't use anymore & and | we have to use or, and, xor
    x or y
    x and y

    var something: Any = employeeFour
    if(something is Employee) { //instance of replace by is and !is
        //val newEmployee = something as Employee //Casting that is not needed because Kotlin compiler apply smart casting
        something = "Hello" //this broke the line something.name
        something = employeeOne //this is ok for the next line
        println(something.name)
    }

    //String Templates in Kotlin
    println(employee1)

    val change = 4.22
    println("To show the value of change, we use \$change")
    println("Your change is $$change")

    val numerator = 10.99
    val denominator = 20.00
    //We use curly braces to eval a value with an expression
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    //To access to a an internal properties we use too curly braces
    println("The employee's id is ${employee1.id}")

    //Raw Strings, using this we don't have to escape special characters like \n
    val filePath ="""c:\somedir\somedir2"""

    val eggName = "Humpty"
    val nurseryRhyme = """$eggName Dumpty sat on the wall
        |$eggName Dumpty had a great fall
        |All the king's horses and all the king's men
        |Couldn't put Humpty together again
    """.trimMargin()

    println(nurseryRhyme)

}

class Employee(var name: String, val id: Int) {

    /*override fun equals(obj: Any?): Boolean {
        if (obj is Employee) { //is replaced the instance of
            return name == obj.name && id == obj.id
        }
        return false
    }*/

    //The variable of the variable is replaced in runtime, this is known as a String template
    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}

/*
    In Java the == operator is checking for referential equality and .equals method is checking for structural equality
*/
