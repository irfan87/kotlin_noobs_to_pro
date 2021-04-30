/*
* let's reversed our name!
* 1.) first, make your name as uppercase
* 2.) then, reverse your uppercase name!
*
* Note: It would be great, if you can present the capital letter of your name.
* */

fun main() {
    val userName = "irfan"
    val userNameUpper = userName.toUpperCase()
    val reversedUserNameUpper = userNameUpper.reversed()
    val userNameCap = userName.capitalize()

    println(userName)
    println(userNameUpper)
    println(reversedUserNameUpper)
    println(userNameCap)
}