fun main() {
    val n = readln().toInt()
    var max = 0
    var index = 0
    var maxIndex = 0
    repeat(n) {
        index++
        val cards = readln().split(" ").map { it.toInt() }
        val maxValue = getMaxValue(cards)
        if (maxValue >= max) {
            max = maxValue
            maxIndex = index
        }
    }
    println(maxIndex)
}

fun getMaxValue(arr: List<Int>): Int {
    var tempMaxValue = 0
    for (i in 0..<arr.size - 2) {
        for (j in i + 1..<arr.size - 1) {
            for (k in j + 1..<arr.size) {
                val sum = (arr[i] + arr[j] + arr[k]).toString()
                if (tempMaxValue < sum[sum.length - 1] - '0') {
                    tempMaxValue = sum[sum.length - 1] - '0'
                }
            }
        }
    }
    return tempMaxValue
}