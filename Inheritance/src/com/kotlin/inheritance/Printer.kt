package com.kotlin.inheritance

/*
    To extend the class in Kotlin you follow the class named by a colon (:) and then follow with the name
    of the class we want to extend. We use the open keyword in the class we want extend to be able
    to extend it.
    Because the printer class doesn't represent one specific model of a printer, we can convert it to
    abstract and remove the open keyword.
 */
fun main() {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    SomethingElse("whatever")
}

abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double //abstract function are open by default
}

/*
    The primary constructor signatures for the parent and child classes don't have to match
 */
open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {

    //If we don't want that any subclass could override this function we have to add the final keyword
    final override fun printModel() = println("The model name of this laser printer is $modelName")

    //override also say that the function is open so subclasses can continue to override that function
    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {
}

/*
    You can't call a super secondary constructor if you have a primary constructor, because
    every constructor has to delegate to the primary constructor.
 */
open class Something {

    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {

    //This is references to the secondary constructor of Something, you can only do this if there is no
    //primary constructor
    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

/*
    Modifier open is incompatible with data, and that's because data classes are closed tight.
    They can't be extended. In fact they can even been abstract or inner classes because that wouldn't make sense.
    They can extend other classes but when it comes to inheritance the buck stops right with them
 */
data class DataClass(val number: Int) {

}
