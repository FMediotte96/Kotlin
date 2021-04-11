package com.kotlin.io

import java.io.File

//Kotlin doesn't have its own IO classes, it performs by extension function de IO classes in the JDK
fun main() {
//    val reader = File("testfile.txt").reader()
//    val lines = reader.readText()
//    println(lines)
//    reader.close()

    //once the lambda has finished executing use we'll go ahead and close the reader
//    val lines = File("testfile.txt").bufferedReader().use { it.readText() }
//    println(lines)

    //Calling and extension function to de File class
//    val lines = File("testfile.txt").readText()
//    println(lines)

    //Instance reading the file in an entire shoot, this is going to read a line at a time
    //
    File("testfile.txt").reader().forEachLine { println(it) }

    //If we use useLines we have to use a terminal operator
    //File("testfile.txt").reader().useLines { it.forEach { println(it) } }

    //.readLines() returns a list of string for us
    //new InputStreamReader(new FileInputStreamReader(new File("testfile.txt")), "UTF-8"); //equivalente in Java

}