import kotlin.math.min

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val rectangle = Array(n) { IntArray(m) }
    for (i in 0..<n) {
        val temp = readln()
        for (j in 0..<temp.length) {
            rectangle[i][j] = temp[j].code - '0'.code
        }
    }
    var length = min(n.toDouble(), m.toDouble()).toInt()
    while (length > 1) {
        var flag = false
        for (i in 0..n - length) {
            for (j in 0..m - length) {
                val temp = rectangle[i][j]
                if (temp == rectangle[i][j + length - 1] && temp == rectangle[i + length - 1][j] && temp == rectangle[i + length - 1][j + length - 1]) {
                    flag = true
                    break
                }
            }
        }
        if (flag) {
            break
        } else {
            length--
        }
    }
    println(length * length)
}
