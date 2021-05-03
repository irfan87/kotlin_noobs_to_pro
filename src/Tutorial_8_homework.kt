import java.lang.Exception
import java.lang.IllegalArgumentException
import kotlin.system.exitProcess

/*
* use break to get the result once, or else your app and your computer will crash..
*
* YOU THINK I AM JOKING??
* */
fun main() {
    print("Please enter your age: ")

    val userInput = readLine()

    while (true) {
        try {
            if(userInput == "q") {
                exitProcess(2)
            }

            if(userInput?.isNotBlank() == true) {
                if(userInput.toInt() < 10) {
                    println("Still young")
                    break
                } else if (userInput.toInt() < 18) {
                    println("You are a young adult")
                    break
                } else if(userInput.toInt() < 60) {
                    println("You are an adult")
                    break
                } else {
                    println("You are old enough")
                    break
                }
            }
        } catch (e: NumberFormatException) {
            println("Please enter the valid input")
            break
        }
    }

}