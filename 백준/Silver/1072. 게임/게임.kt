fun main() {
    val (x, y) = readln().split(" ").map { it.toLong() }
    val z = y * 100 / x
    val answer: Long
    if (z >= 99) {
        answer = -1
    } else {
        var start: Long = 1
        var end = x
        while (start < end) {
            val mid = (start + end) / 2
            val curX = x + mid
            val curY = y + mid
            val curRate = curY * 100 / curX
            if (curRate > z) {
                end = mid
            } else {
                start = mid + 1
            }
        }
        answer = end
    }
    println(answer)
}
