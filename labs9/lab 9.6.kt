fun sortStringsArray(arr: Array<String>): Array<String> {
    return arr.sortedArray()
}

fun main() {
    val strings = arrayOf("banana", "apple", "kiwi", "cherry", "grape")

    val sortedStrings = sortStringsArray(strings)

    println("Отсортированные строки:")
    sortedStrings.forEach { println(it) }
}
