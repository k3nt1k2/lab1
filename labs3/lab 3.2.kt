fun main() {
    print("Первое: ")
    val a = readLine()!!.toInt()
    print("Второе: ")
    val b = readLine()!!.toInt()
    print("Третье: ")
    val c = readLine()!!.toInt()

    if (a == b || b == c || a == c) {
        println("Ошибка")
    } else {
        val mid = if ((a > b && a < c) || (a > c && a < b)) {
            a
        } else if ((b > a && b < c) || (b > c && b < a)) {
            b
        } else {
            c
        }

        println("Среднее число: $mid")
    }
}
