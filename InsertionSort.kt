fun main() {
    val array = intArrayOf(12, 11, 13, 5, 6)
    insertionSort(array)
    println("Sorted Array: ${array.joinToString(", ")}")
}

fun insertionSort(array: IntArray) {
    for (i in 1 until array.size) {
        val key = array[i]
        var j = i - 1

        // Move elements of array[0..i-1], that are greater than key,
        // to one position ahead of their current position
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j]
            j--
        }
        array[j + 1] = key
    }
}
