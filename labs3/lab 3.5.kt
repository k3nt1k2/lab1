fun main() {
    print("Введите длину первой стороны: ")
    val a = readLine()!!.toInt()
    print("Введите длину второй стороны: ")
    val b = readLine()!!.toInt()
    print("Введите длину третьей стороны: ")
    val c = readLine()!!.toInt()

    if (a + b > c && a + c > b && b + c > a) {
        println("Треугольник с такими сторонами может существовать")
    } else {
        println("Треугольник с такими сторонами не может существовать")
    }
}
