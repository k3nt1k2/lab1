fun getStringLength(input: String): Int {
    return input.length
}

fun main() {
    print("Введите строку: ")
    val userInput = readLine().orEmpty() // Считываем строку, обрабатываем null как пустую строку
    val length = getStringLength(userInput)
    println("Длина строки: $length")
}
