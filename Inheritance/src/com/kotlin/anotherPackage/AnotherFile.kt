package com.kotlin.anotherPackage

//Import with alias
import com.kotlin.inheritance.CompanyCommunications as Comm
import com.kotlin.inheritance.topLevel as tp
import com.kotlin.inheritance.Department.*
import com.kotlin.inheritance.upperFirstAndLast as ufal

fun main() {
    tp("Hello from AnotherFile")
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
    println("some string".ufal())
}