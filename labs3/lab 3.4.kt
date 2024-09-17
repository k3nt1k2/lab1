fun main() {
    print("Введите большее число: ")
    val larg = readLine()!!.toInt()
    print("Введите меньшее число: ")
    val small = readLine()!!.toInt()

    if (larg % small == 0) {
        println("Число $larg кратно числу $small")
    } else {
        val ost = larg % small
        println("Число $larg не кратно числу $small, остаток: $ost")
    }
}
