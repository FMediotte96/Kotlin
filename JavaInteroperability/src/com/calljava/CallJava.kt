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
    car.color = "green"
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
}