fun main() {
    val sb = StringBuilder()
    val t = readln().toInt()
    repeat(t) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        val arrA = readln().split(" ").map { it.toInt() }
        val arrB = readln().split(" ").map { it.toInt() }.toMutableList()
        arrB.sort()
        var answer = 0
        for (j in 0..<n) {
            for (k in m - 1 downTo 0) {
                if (arrA[j] > arrB[k]) {
                    answer += k + 1
                    break
                }
            }
        }
        sb.append(answer).append("\n")
    }
    println(sb)
}
