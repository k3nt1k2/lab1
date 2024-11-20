fun <T> copyArray(array: Array<T>): Array<T> {
    return array.copyOf()
}

fun main() {
    val originalArray = arrayOf(1, 2, 3, 4, 5)
    val copiedArray = copyArray(originalArray)

    println("Исходный массив: ${originalArray.joinToString(", ")}")
    println("Скопированный массив: ${copiedArray.joinToString(", ")}")
}
