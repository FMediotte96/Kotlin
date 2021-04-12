package com.callingKotlinFromJava;

import com.kotlincode.Car;
import com.kotlincode.StaticCar;

public class Main {

    public static void main(String[] args) {
        StaticCar.topLevel();

        //This is the way to call a Kotlin extension function from Java
        StaticCar.print("print this Java string");

        Car car = new Car("blue", "BMW", 2011);
//        System.out.println(car.getModel());
        System.out.println(car.getColor());
    }
}