package com.calljava

import com.javacode.Car

/*  Nullability
    @NotNull from org.jetbrains.annotations doesn't allow null, we get an exceptions if we assign null
    @Nullable from org.jetbrains.annotations allows null

    When the Kotlin compiler doesn't have any information about whether a type is nullable or not
    the type is what's called a platform type. This means that you can use it either as a nullable or a non-nullable value
    Platform types can't be created in Kotlin, they can only result when you're mixing Kotlin with another language
    like Java
 */
fun main() {

    val car = Car("blue", "Ford", 2015)
    car.color = "green" //we can only refer like this is the Java class has getters and setters method for the property
    println(car)

    //the default for a Java type that isn't annotated with anything is the nullable type
    //We can treat values coming from Java as non nullable and protect against NullPointerExceptions in
    //the Kotlin code
    //We can't use String? and mixed with Java class
    //When you get a value from Java that isn't annotated you can assign it to a nullable or a non-nullable type
    //var model: String = car.model
    //println(model.javaClass)
    //model = null
    //println(model)

    //val color: Int = car.color

    car.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(
        10,
        *strings
    ) //we cannot pass arrays to java code in this way, we have to use spread operator to unpack the array first

    car.wantsIntArray(intArrayOf(1, 2, 3)) //we can use primitive type arrays

    //Any is equivalent to Object. If we want to be able to use all the method that object class provide
    //then we need to cast this to a Java Language object
    //(car.anObject as java.lang.Object).notify()
    //car.anObject.javaClass //equivalent to getClass()

    //We access static members in Java classes as you would companion objects
    println("x = ${Car.x}")
    println(Car.xString())

    //Sam(single abstract method) conversions
    car.demoMethod { println("I'm in a thread") }
}