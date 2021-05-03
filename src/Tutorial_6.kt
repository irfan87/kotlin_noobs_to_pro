/*
* play around with operators in Kotlin
* */

fun main() {
    val a = 4
    val b = 5

    val c = 6
    val d = 6

    // this return false because 4 is not equal to 5
    println(a == b)

    // this return true because 6 is equal to 6
    println(c == d)

    // this will return true because 4 is smaller than 5, and vice versa
    println(a < b)

    // this will return false because, logically, 4 is smaller than 5
    println(a > b)

    // this will return false because 6 and 6 is equal
    println(c > d)
    println(c < d)

    // both are return true because 6 is equal to 6 and 4 is less or equal to 6
    println(c >= d)
    println(a <= c)

    // 4 is not equal, which means not same to 5, so it's return true
    println(a != b)

    // 6 is equal to 6, which means both numbers are identical, so it's return false
    println(c != d)

    // it returns false because 4 is not equal to 5, and 6 is equal to 6
    // false AND true = false
    println(a == b && c == d)

    // 4 == 5 is false, 6 == 6 is true
    // false OR true = true
    println(a == b || c == d)

    // false OR false = true
    println(a == b || !(c == d))

    // 4 == 5 (false)
    // 5 == 6 (true)
    // false || true = false
    // !false = true
    println(!(a == b || c == d))

    println(!((a == b || c == d )&& a > c))
}