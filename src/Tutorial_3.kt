/*
* Today, we are going to play math!! >:)
* Just make it simple.
* Don't use function or method for this exercise
* Nothing fancy!
* */

fun main() {
    var x = 15
    var y = 7
    val add: Int = x + y
    val sub: Int = x - y
    val mult: Int = x * y
    val div: Int = x / y
    val mod: Int = x % y

    x %= 20
    println("The result for x is $x")


    println("Add Result: $add")
    println("Sub Result: $sub")
    println("Mult Result: $mult")
    println("Div Result: $div")
    println("Mod Result: $mod")
}
