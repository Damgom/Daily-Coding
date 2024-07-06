fun main() {
    readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }
    val k = readln().toInt()

    var count = 0L
    for (i in arr.indices) {
        var sum = 0L
        var j = i
        while (j < arr.size) {
            sum += arr[j].toLong()
            if (sum > k) {
                count += (arr.size - j).toLong()
                break
            } else {
                j++
            }
        }
    }
    println(count)
}
