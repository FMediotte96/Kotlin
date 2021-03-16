package com.kotlin.code

fun main() {
//    val bicycle = KotlinBicycle(20, 2, 50)
//    bicycle.printDescription()
//
//    val mountainBike = KotlinMountainBike(50, 20, 8, 50)
//    mountainBike.printDescription()
//
//    val roadBike = KotlinRoadBike(18, 40, 5, 70)
//    roadBike.printDescription()

//    val bicycle2 = KotlinBicycle(20, 50)
//    bicycle2.printDescription()
//
//    val mountainBike2 = KotlinMountainBike(20, 50, 50)
//    mountainBike2.printDescription()
//
//    val roadBike2 = KotlinRoadBike(40, 70, 18)
//    roadBike2.printDescription()

    val mountainBike3 = KotlinMountainBike("Blue", 10, 10, 10)
    mountainBike3.printDescription()

    KotlinMountainBike.availableColors.forEach{ println(it) }

}

//Making the parameter optional in the superclass not make it optional in the subclasses
open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println(
            "Bike is in gear $gear with a cadence of $cadence " +
                    "travelling at a speed of $speed."
        )
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
    KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription();
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

    constructor(color: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 20) :
            this(seatHeight, cadence, speed, gear) {
        println("This is the $color")
    }

    //Companion object. List<String> called availableColors
    //initialize the list to "blue", "red", "white", "black", "green" and "brown"
    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10) :
    KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }

}