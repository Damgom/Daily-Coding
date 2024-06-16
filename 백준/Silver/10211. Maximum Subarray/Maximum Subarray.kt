fun main() {
    val n = readln().toInt()
    repeat(n) {
        val num = readln()
        val input = readln().split(" ").map { it.toInt() }
        println(getMaxSubArray(input))
    }
}

fun getMaxSubArray(arr: List<Int>): Int {
    var maxSum = arr[0]
    var currentSum = arr[0]

    for (i in 1..<arr.size) {
        currentSum = maxOf(arr[i], currentSum + arr[i])
        maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum
}