package com.kotlin.challenge

fun main() {
    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jean", "Smithson", 66)

    val people = mapOf(
        "Jones" to joe,
        "Smith" to jane,
        "Wilson" to mary,
        "Adams" to john,
        "Smithson" to jean
    )
    println(people.filter { it.value.lastName.startsWith('S') }.count())

    //Creating pairs
    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    //Another way
    val firstNames = people.map { it.value.firstName }
    val lastNames = people.map { it.value.lastName }
    val namePairs2 = firstNames.zip(lastNames)
    println(namePairs2)

    val (fName, lName, age) = joe
    println("fName= $fName, lName = $lName, age= $age")

    //also()
    //Joe is 45 years old
    //Jane is 12 years old
    //etc
    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }

    //create a third list that only contains items that are in both of these lists
    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)

    val list3 = list1.filter { it in list2 }
    //val list3 = list1.filter { list2.contains(it) }
    println("list3 = $list3")

    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    //paper = regularPaper

    regularPaper = paper
}

data class Person(val firstName: String, val lastName: String, val age: Int) {
//    operator fun component1() = firstName
//    operator fun component2() = lastName
//    operator fun component3() = age
}

//If we use covariance, when we do this we can only take papers from the box
//If we use contravariance, when we do this we can only is add papers but not read them
class Box<in T> {

}

open class Paper {

}

class Regular: Paper() {

}

class Premium: Paper() {

}