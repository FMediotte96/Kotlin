package com.kotlin.io

import java.io.File

/*
Kotlin has added extension functions to the file class that can help us walk a file tree
The walk function accepts a direction that specifies whether you want up a tree or down a tree
The walk bottom-up function walks up a file tree: directories are visited after their files
The walk down function walks down a file tree: directories are visited before their files
 */
fun main() {
    //It will be each file of the tree
    File(".").walkTopDown()
        .filter { it.name.endsWith(".kt") }
        .forEach { println(it) }
}