package com.callingKotlinFromJava;

import com.kotlincode.Car;
import com.kotlincode.SingletonObj;
import com.kotlincode.StaticCar;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StaticCar.topLevel();

        //This is the way to call a Kotlin extension function from Java
        StaticCar.print("print this Java string");

        Car car = new Car("blue", "BMW", 2011);
        System.out.println(car.model);
        System.out.println(car.getColor());

//        Car.Companion.carComp();
        Car.carComp(); //we can't call a companion object in this way if we add the annotations @JvmStatic

//        SingletonObj.INSTANCE.doSomething(); //INSTANCE is the single instance of object class
        SingletonObj.doSomething();
        System.out.println("isAuto = " + Car.constant);

//        car.printMe(null);

        try {
            StaticCar.doIO();
        } catch (IOException e) {
            System.out.println("IOException!");
        }

        StaticCar.defaultArgs("The number is: ");
    }
}