fun countVowels(input: String): Int {
    val glas = "AEIOUaeiou" 
    return input.count { it in glas }
}

fun main() {
    print("Введите строку: ")
    val userInput = readLine().orEmpty()
    val vowelCount = countVowels(userInput)
    println("Количество гласных в строке: $vowelCount")
}
