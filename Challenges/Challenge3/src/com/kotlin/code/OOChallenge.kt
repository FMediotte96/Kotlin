package com.kotlin.code

import sun.util.resources.cldr.de.CalendarData_de_BE

open class KotlinBicycle(var cadence: Int, var gear: Int, var speed: Int) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println(
            "Bike is in gear $gear with a cadence of $cadence " +
                    " travelling at a speed of $speed."
        )
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int, speed: Int) :
    KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription();
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int, speed: Int) :
    KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }

}