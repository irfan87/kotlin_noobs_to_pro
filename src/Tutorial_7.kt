fun main() {
    val x = 7
    val y = 7

    // it is same with ternary operator x + y == 14 ? "it is the answer" : "it is not the answer"
    val z = if(x + y == 14) "it is the answer" else "it is not the answer"

    if(x < y) {
        println("$x is lesser than $y")
    } else if (x > y) {
        println("$x is bigger than $y")
    } else {
        println("$x is equal to $y")
    }

    println("this text will always printed")

    println(z)
}