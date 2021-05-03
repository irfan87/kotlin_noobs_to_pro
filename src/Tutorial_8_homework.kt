import kotlin.Exception
import kotlin.system.exitProcess

/*
* use break to get the result once, or else your app and your computer will crash..
*
* YOU THINK I AM JOKING??
* */
fun main() {
    print("Please enter your age: ")

    val userInput = readLine()?.toInt()

    try {
        // 0 means exit or off
        if(userInput == 0) {
            exitProcess(2)
        }


        if(userInput != null) {
            if(userInput.toInt() < 10) {
                println("Still young")
            } else if (userInput.toInt() < 18) {
                println("You are a young adult")
            } else if(userInput.toInt() < 60) {
                println("You are an adult")
            } else {
                println("You are old enough")
            }
        }
    } catch (e: Exception) {
        // unable to find the exact exception to show the certain error message.. =(.. will fix later
       // println("Please enter the valid input")
        throw e
    }
}