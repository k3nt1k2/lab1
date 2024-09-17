fun main() {

    print("Введите двузначное число: ")
    val number = readLine()!!.toInt()

    if (number !in 10..99 && number !in -99..-10) {
        println("Число должно быть двузначным")
    }

    val absNumber = Math.abs(number)
    val firstDigit = absNumber / 10
    val secondDigit = absNumber % 10

    when {
        firstDigit > secondDigit -> println("Первая цифра ($firstDigit) больше второй ($secondDigit)")
        firstDigit < secondDigit -> println("Вторая цифра ($secondDigit) больше первой ($firstDigit)")
        else -> println("Цифры одинаковы")
    }
}
