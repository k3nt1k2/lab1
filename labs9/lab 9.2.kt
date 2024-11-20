fun countVowelsAndConsonants(input: String) {
    val glas = "AEIOUaeiou"
    var glasCount = 0
    var soglCount = 0

    for (char in input) {
        when {
            char in glas -> glasCount++
            char.isLetter() -> soglCount++
        }
    }

    println("Количество гласных: $glasCount")
    println("Количество согласных: $soglCount")
}

// Пример использования
fun main() {
    print("Введите строку: ")
    val userInput = readLine().orEmpty() // Считываем строку
    countVowelsAndConsonants(userInput)
}
