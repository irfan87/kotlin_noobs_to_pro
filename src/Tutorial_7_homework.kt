fun main() {
    val words = "android".reversed()

    val reversedWords = if(words.reversed() == words) "palindrome" else "not palindrome"

    println(reversedWords)
}