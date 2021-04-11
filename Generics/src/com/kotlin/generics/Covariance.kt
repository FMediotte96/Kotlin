package com.kotlin.generics

//Variants -> Covariance and contravariance
fun main() {
    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt2(shortList)
}

//Mutable is invariant
//Covariant classes can only declare functions but the type in the out position meaning with the generic
//type as the return type of a function
fun convertToInt2(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden) //This error is happening because the garden class is what's called invariant
}

//Subclasses of flower will not be accepted. In other words subtyping is not preserved it's invariant.
//If we want that accept subclasses garden can no longer be invariant, we have to make it covariant
fun waterGarden(garden: Garden<Flower>) {

}

open class Flower {

}

class Rose : Flower() {

}

/*We make Garden covariant adding the out keyword. Now that the class is covariant we're restricted
with what we can do with it and doesn't sound like immutable collections as well, we restricted what you
can do with an immutable collection. We can read them but we can't add anything to them.
You can only use a covariance class in what is called the out position.
Kotlin has the notion of in and out positions. Function parameters are considered to be an in position,
the function return type is an out position.
Here we have to avoid the problem for a set, that's why the parameter is private
*/
class Garden<out T : Flower>(private var something: T) {

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]
//    fun plantFlower(flower: T) { //Type parameter T is declared as 'out' but occurs in 'in' position in type T
//    }
}
/*
When we're discussing generics using type and subtype is more accurate than using class and subclass
depending on the context. For example list is a class but a list of String is a type. List of int or list of short
is a subtype of lists of number because a list of int isn't a subclass of a list of number we're not extending
anything. It's important to understand the distinction between a subclass and a subtype. The same goes to supertype.

Covariance
We want to treat a list of short like a list of number, and we were able to do that when we were using an immutable list.
So what we're saying is we want list of short to be a subtype of list of number and if we want this subtyping to be
preserved when working with generics we have to declare the type parameter to be covariant.

Exceptions:
-Constructor parameters don't have in and out positions, so you can always accept a covariant class is a constructor parameter
That's because constructor are called when an instance is created.
-If you declare a VAR variable of type T then T can't be covariant
 */