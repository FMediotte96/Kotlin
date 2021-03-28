package com.java.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JavaGenerics {

    //We use generics whenever we want to be more specific about a type
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        //list.add(new BigDecimal(10.5)); //compiler time error
        list.get(0).toUpperCase(); //The compiler have already now that it's a String

        List list1 = new ArrayList<>();
        list.add("Goodbye");

        //boolean b = list instanceof List<String>; this not work
        //Generics are a compile time feature
        boolean b = list instanceof List;
    }
}
