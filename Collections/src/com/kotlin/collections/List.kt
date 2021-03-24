package com.kotlin.collections

fun main() {
    val strings = listOf("spring", "summer", "fall", "summer", "winter")
    val colorList = listOf("black", "white", "red", "black", "red")

    //Last element
    println(strings.last())

    //Reverse
    println(strings.asReversed())

    /*if (strings.size > 5) {
        println(strings[5])
    }*/
    //More concise way
    println(strings.getOrNull(5))

    //Max value
    val ints = listOf(1,2,3,4,5)
    println(ints.maxOrNull())

    //zip: join lists
    println(colorList.zip(strings)) //we have pairs elements. Pair is Kotlin class

    //MergedLists
    val mergedLists = listOf(colorList, strings)
    println(mergedLists)

    //This is the way to concatenate lists
    val combinedList = colorList + strings
    println(combinedList)

    //To avoid duplicates we have to use the union function
    val noDupList = colorList.union(strings)
    println(noDupList)

    //eliminate the duplicates
    val noDupColors = colorList.distinct()
    println(noDupColors)

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)

}