/*
* Today, we are going to learn how to use 'var', 'val', 'integer', and 'boolean' in Kotlin.
* 'var' is stands for variable, which means, we can make a changes. or, just what we call as mutable.
* whereas 'val' is constants, where we've already know that constant is constants, which is immutable (or to be more understandable, we're unable to make any changes, once it's declare)
* 'boolean' is the the truthy or falsy variables. Usually, we used this to check the conditions if it true or not
* */

fun main() {
    // the way we declare myNumber as Int
    var myNumber: Int = 7
    val addedNumber = 1
    var isRaining = true

    // this should print 8
    println(myNumber)

    // print the result as the full sentence
    println("After we sum $myNumber with 1, the result should be ${myNumber + addedNumber}")

    if(isRaining) println("Today is raining") else println("Today is not raining")
}