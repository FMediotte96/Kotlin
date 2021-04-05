package com.kotlin.generics

//If we looked at this code it's kind of repetitive, we don't want to repeat this for every flower we might have
fun main() {

    val flowerTender = object: FlowerCare<Flower2> {
        override fun prune(flower: Flower2) = println("I'm tending a ${flower.name}!")
    }

    val roseTender = object: FlowerCare<Rose2> {
        override fun prune(flower: Rose2) = println("I'm pruning a rose!")
    }
    val roseGarden = Garden2(listOf(Rose2(), Rose2()), flowerTender)
    roseGarden.tendFlower(0)

    val daffodilTender = object: FlowerCare<Daffodil> {
        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil!")
    }
    val daffodilGarden = Garden2(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2)
}

open class Flower2(val name: String) {

}

class Garden2<T: Flower2>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

class Rose2: Flower2("Rose") {

}

class Daffodil: Flower2("Daffodil") {

}

//T should accept whatever T is in any of its superclasses, by doing this we don't have to create a in an instance of
//FlowerCare for every single possible type of flower
interface FlowerCare<in T> {
    fun prune(flower: T)
//    fun pick(): T
}
/*
    Contravariant is the opposite of covariance, when we use covariance we're preserving the subtyping,
    when we use contravariance we're going in the opposite direction, we're starting at a subclass and we wing to
    accept instances of that subclass or any of its superclasses. So when it comes to contravariant we're looking up
    the inheritance tree rather than down the inheritance tree.

    Contravariant types use the in position, the price is we can only write it so we can only use contravariant
    classes as parameters, we can't use them as return types of functions because the return type is in the out position
 */