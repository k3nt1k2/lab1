fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()

    val vis = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    if (vis) {
        println("$year - високосный год")
    } else {
        println("$year - невисокосный год")
    }
}
