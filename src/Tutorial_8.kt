/*
* yes!! finally, playing with user input in Kotlin!!!! hahahahah
* */
fun main() {
    val userInput = readLine()

    if(userInput == null || userInput?.isEmpty()) {
        println("REQUIRED!")
    }else {
        println("You have entered ${userInput?.reversed()}")
    }
}