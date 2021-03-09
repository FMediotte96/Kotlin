package com.kotlin.functions

/*
 * To declare a function we start with the keyword fun and follow it with the function name,
 * next come the parameter list and the default return type for a function is unit
 * The return type is always at the end following a colon
 */
fun main() {
    //Once you've put one parameter out of order, you have to use names for all of them
    //This is known as named arguments, calling the function and labeling your arguments is the function call
    println(labelMultiply(label = "Here's the result:", operand2 = 3, operand1 = 4))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("grey", "Ford", 2017)

    printColors(car1, car2, car3)

    //arrayOf use vararg arguments in his function signature as so a lot of functions in the collections classes
    val numbers = arrayOf(1, 2, 3)

    val manyCars = arrayOf(car1, car2, car3)
    /*
        When we have a function that's expecting a vararg and we have and array
        and we want to pass the array to that function we have to use de spread operator which will unpack
        the array and pass the elements as individual arguments, the spread operator is the asterisk(*).
        This spread operator can be use any time you need to unpack an array
     */
    printColors(*manyCars)

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }

    //It looks that the upperFirstAndLast function belongs to the String class but it doesn't
    val s = "this is all in lowercase"
    println(s.upperFirstAndLast())

}

//Vararg is use for passing some number of something. We can only have one vararg parameter in a function signature
//If we add more parameters we have to use their names arguments in a function call excepted if the vararg is the last
//argument in the function signature
fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color)
    }
}

fun whatever() = 3 * 4

/*fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label ${operand1 * operand2}")
}*/

/*
    We can define this function also in one line using the equals operator as follow, the function will be returning
    whatever comes after the equal sign.
    Also we can remove the return type because the compiler can infer it

    Functions with curly braces have what's called a block body.
    And functions without curly braces have what's called an expression body.

    In our functions parameters we always have to include the type, even if the compiler can infer it
 */
fun labelMultiply(
    operand1: Int, operand2: Int,
    label: String = "The answer is:"
) =
    "$label ${operand1 * operand2}"

class Employee(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()
}

data class Car(val color: String, val model: String, val year: Int) {

}

/*
    Extension function let you extend any class you want to extend means you can add functions to it.
    Instead of using a Class as Utils to use a particular function we can create the illusion of adding functions
    to the string class. We have to declare the library where we want to include the functions like the following.
    We've preceded the function name with what's called the receiver type
 */
fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).toUpperCase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}

