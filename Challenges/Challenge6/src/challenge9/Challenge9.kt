package challenge9

import com.javacode.Employee

fun main() {
    val employee = Employee("Jane", "Smith", 2000)

    //Make this code compile
    employee.lastName = "Jones" //We need both a set and a get if we want to use the dot notation or the property access syntax
    employee.salaryLast3Years = floatArrayOf(50000.25f, 54000.60f, 56800.42f)
}