fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    if (num1 > num2) {
        println("Большее число: $num1")
        println("Меньшее число: $num2")
    } else {
        println("Большее число: $num2")
        println("Меньшее число: $num1")
    }
}
