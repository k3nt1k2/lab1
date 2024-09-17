fun main() {
    print("Введите тип пищи (например, 'пицца', 'суп', 'омлет'): ")
    val foodType = readLine()?.trim()?.lowercase() ?: return

    val cookingTime = when (foodType) {
        "пицца" -> "20 минут"
        "суп" -> "45 минут"
        "омлет" -> "10 минут"
        "паста" -> "15 минут"
        "рис" -> "20 минут"
        else -> "Неизвестный тип пищи"
    }

    println("Время приготовления $foodType: $cookingTime")
}
