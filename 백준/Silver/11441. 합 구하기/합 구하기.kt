fun main() {
    val n = readln().toInt()
    val arr = IntArray(n + 1)
    val input = readln().split(" ").map { it.toInt() }
    for (i in 0..<n) {
        arr[i + 1] = arr[i] + input[i]
    }
    var m = readln().toInt()
    val sb = StringBuilder()
    while (m-- > 0) {
        val temp = readln().split(" ").map{ it.toInt() }
        val start = temp[0]
        val end = temp[1]
        val result = arr[end] - arr[start - 1]
        sb.append(result).append('\n')
    }
    println(sb)
}
