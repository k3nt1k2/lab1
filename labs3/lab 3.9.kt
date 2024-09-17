fun main() {
    print("Введите число m: ")
    val m = readLine()!!.toInt()
    print("Введите число n: ")
    val n = readLine()!!.toInt()

    if (m % n == 0) {
        val chas = m / n
        println("Частное от деления m на n: $chas")
    } else {
        println("$m на $n нацело не делится")
    }
}
