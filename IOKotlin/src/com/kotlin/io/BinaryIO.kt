package com.kotlin.io

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main() {

    val di = DataInputStream(FileInputStream("testfile.bin"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {

    }

    //the compiler doesn't have try with resources in the same way that Java does,
    //so it really doesn't understand what we're trying to do here
    //Instead of using the try with resources we have to use one of the "use" functions
}