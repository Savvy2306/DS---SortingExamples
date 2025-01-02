fun main() {
    val array = intArrayOf(38, 27, 43, 3, 9, 82, 10)
    mergeSort(array)
    println("Sorted Array: ${array.joinToString(", ")}")
}

fun mergeSort(array: IntArray) {
    if (array.size > 1) {
        // Find the middle of the array
        val mid = array.size / 2

        // Split the array into two halves
        val left = array.copyOfRange(0, mid)
        val right = array.copyOfRange(mid, array.size)

        // Recursively sort the two halves
        mergeSort(left)
        mergeSort(right)

        // Merge the two sorted halves
        merge(array, left, right)
    }
}

fun merge(array: IntArray, left: IntArray, right: IntArray) {
    var i = 0  // Index for left subarray
    var j = 0  // Index for right subarray
    var k = 0  // Index for merged array

    // Merge the subarrays into the original array
    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            array[k] = left[i]
            i++
        } else {
            array[k] = right[j]
            j++
        }
        k++
    }

    // If there are any remaining elements in the left subarray, add them
    while (i < left.size) {
        array[k] = left[i]
        i++
        k++
    }

    // If there are any remaining elements in the right subarray, add them
    while (j < right.size) {
        array[k] = right[j]
        j++
        k++
    }
}
