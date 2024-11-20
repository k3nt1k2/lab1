fun printNumber(n: Int): List<Int> {
    return if (n == 0) {
        emptyList()  // Если n равно 0, возвращаем пустой список
    } else {
        (n downTo 1).toList()
    }
}

fun main() {
    println(printNumber(0))
    println(printNumber(3))
    println(printNumber(6))
}
