fun main() {
    val n = readln().toInt()
    val arr = IntArray(1001)
    var max = Int.MIN_VALUE
    var maxIndex = 0
    var lastIndex = Int.MIN_VALUE
    for (i in 0..<n) {
        val input = readln().split(" ").map { it.toInt() }
        val a = input[0]
        val b = input[1]
        arr[a] = b
        if (b > max) {
            max = b
            maxIndex = a
        }
        if (a > lastIndex) {
            lastIndex = a
        }
    }
    var left = 0
    var temp = arr[0]
    for (i in 0..<maxIndex) {
        if (arr[i] > temp) {
            temp = arr[i]
        }
        left += temp
    }
    var right = 0
    var rightTemp = arr[lastIndex]
    for (i in lastIndex downTo maxIndex + 1) {
        if (arr[i] > rightTemp) {
            rightTemp = arr[i]
        }
        right += rightTemp
    }
    val result = left + right + max
    println(result)
}
