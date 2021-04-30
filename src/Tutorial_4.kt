/*
* Today, we are learning float and double number in Kotlin.
* In Kotlin, we can declare the float and double variable as below.
*
* Note:
* If you notice the 'F' letter behind the integer, it is like a flag to tell Kotlin that this number is a float.
* For double, we only specified the double number as below.
* Recommended to use float than double because of the memory consumption
* */

fun main() {
    // float number
    val x = 20.15F
    val y = 8

    val result = x / y

    // double number
    val a = 20.12312
    val b = 312

    val sumResult = a + b

    println("$x / $y = $result")
    println("$a / $b = $sumResult")
}