package com.kotlin.collections

fun main() {
    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    println(immutableMap.asSequence().filter { it.value.model == "Ford" }
        .map { it.value.color })

    /*One use cases for sequences is to avoid the creation of intermediate collection instances
    Another great use case is when you don't know how large a collection will be
    Sequences are pretty much the same as streams in Java, each element in a sequence is evaluated individually
    and is then passed to the next step in the chain when applicable. Because of this there is no need to create
    any intermediate collection instance. We only want to convert a collection into a sequence only for large
    collections because Kotlin collections are very efficient

    We can perform two type of operations on sequences intermediate and terminal as we have in Java
    Intermediate operations are lazy
    To finalize a sequence we need a terminal operators, if we don't have it the intermediate operations won't
    execute at all
    */

    //We need a semicolon to concatenate more than one predicate in a lambda
    //THE ORDER IS VERY IMPORTANT FOR PERFORMANCE
    listOf("Joe", "Mary", "Jane").asSequence()
        .filter { println("filtering $it"); it[0] == 'J' } //intermediate operator
        .map { println("mapping $it"); it.toUpperCase() } //intermediate operator
        .find { it.endsWith('E') } //returns the first that match the predicate
}