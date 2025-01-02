fun main(){
    val array = intArrayOf(8,7,5,6,2)
    val result = bubbleSort(array)
    println("Sorted Array: ${result.joinToString(", ")}")

}

private fun bubbleSort(array: IntArray): IntArray{
    val n = array.size
    for(i in 0 until n-1){
        for(j in 0 until n-i-1){
            if(array[j] > array[j+1]){
                array[j] = array[j+1].also{
                    array[j+1] = array[j]
                }
            }
        }
    }

    return array
}