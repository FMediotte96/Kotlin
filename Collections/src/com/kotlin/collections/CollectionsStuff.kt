package com.kotlin.collections

fun main() {
    val setInts = setOf(10, 15, 19, 5, 3, -22)

    //use filter
    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "BMW", 2015),
        8 to Car("green", "Ford", 2010)
    )

    //We are creating a collection that only have the year of the cars
    println(immutableMap.map { it.value.year })
    //We can use filter and map together
    println(immutableMap.filter { it.value.model == "Ford" }.map { it.value.color })

    println(immutableMap.filter { it.value.year == 2016 })

    val mutableMap = mutableMapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013)
    )

    println(mutableMap.filter { it.value.color == "silver" })
    //The filter function return a new map, a new instance of the collection
    println("The filters map is $mutableMap")

    val ints = arrayOf(1, 2, 3, 4, 5)
//    val add10List: MutableList<Int> = mutableListOf()
//    for (i in ints) {
//        add10List.add(i + 10)
//    }
//    println(add10List)

    //We can use the map function to initialize the mutableList
    val add10List = ints.map { it + 10 }
    println(add10List.javaClass)

    //all the cars have to match this condition
    println(immutableMap.all { it.value.year > 2014 })

    //any function, at least one match it this predicate will return
    println(immutableMap.any { it.value.year > 2014 })
    //count
    println(immutableMap.count { it.value.year > 2014 })
    //list of all the car's values
    val cars = immutableMap.values
    //find the first car that matches
    println(cars.find { it.year > 2014 })
    //criteria
    println(cars.groupBy { it.color }) //this convert to a map

    //Sorting
    println(immutableMap.toSortedMap())
    println(cars.sortedBy { it.year })
}