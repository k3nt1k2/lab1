fun <T> getLastElement(array: Array<T>): T? {
    return if (array.isNotEmpty()) array.last() else null
}

fun main() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(getLastElement(numbers))

    val words = arrayOf("apple", "banana", "cherry")
    println(getLastElement(words)) 

    val emptyArray = emptyArray<Int>()
    println(getLastElement(emptyArray))
}
