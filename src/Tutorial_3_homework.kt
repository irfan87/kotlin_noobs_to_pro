/*
* calculate x, y and z
* 1.) first print out the x
* 2.) then, print the sum result of x and y
* 3.) lastly, print out the sum result of x, y and z
*
* note: don't use any fancy library or class.
* I know you are smart but we just want to make this study as simple as it can
* */

fun main() {
    var x: Int = 3
    var y: Int = 4
    var z: Int = 5

    val twoIntSum = x + y
    val threeIntSum = x + y + z

    println("X is $x")
    println("$x + $y = $twoIntSum")
    println("$x + $y + $z = $threeIntSum")
}