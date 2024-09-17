fun main() {
    print("Введите четырёхзначное число: ")
    val number = readLine()!!.toInt()
    
    if (number !in 1000..9999 && number !in -9999..-1000) {
        println("Число должно быть четырёхзначным")
    }
    
    val absNumber = Math.abs(number)
    val d1 = absNumber / 1000 % 10  
    val d2 = absNumber / 100 % 10    
    val d3 = absNumber / 10 % 10     
    val d4 = absNumber % 10          
    
    val sumFirstTwo = d1 + d2
    val sumLastTwo = d3 + d4
    if (sumFirstTwo == sumLastTwo) {
        println("Сумма двух первых цифр равна сумме двух последних")
    } else {
        println("Сумма двух первых цифр не равна сумме двух последних")
    }
    
    val sumAll = d1 + d2 + d3 + d4
    if (sumAll % 3 == 0) {
        println("Сумма всех цифр кратна 3")
    } else {
        println("Сумма всех цифр не кратна 3")
    }
    
    val productAll = d1 * d2 * d3 * d4
    if (productAll % 4 == 0) {
        println("Произведение всех цифр кратно 4")
    } else {
        println("Произведение всех цифр не кратно 4")
    }
    
    val a = 12 
    if (productAll % a == 0) {
        println("Произведение всех цифр кратно $a")
    } else {
        println("Произведение всех цифр не кратно $a")
    }
}
