fun main() {
    val array = intArrayOf(64, 25, 12, 22, 11)
    val sortedArray = selectionSort(array)
    println("Sorted Array: ${sortedArray.joinToString(", ")}")
}

private fun selectionSort(array: IntArray): IntArray {
    val n = array.size
    for(i in 0 until n-1){
        var minIndex = i
        for(j in i+1 until n){
            if(array[j] < array[minIndex]){
                minIndex = j
            }
        }

        if(minIndex != i){
            val temp = array[i]
            array[i] = array[minIndex]
            array[minIndex] = temp
        }
    }

    return array
}