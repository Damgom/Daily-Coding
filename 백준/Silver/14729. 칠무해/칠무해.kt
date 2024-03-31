fun main() {
    val n = readln().toInt()
    val answer = IntArray(100001)
    var cnt = 0
    repeat(n) {
        val score = (readln().toDouble() * 1000).toInt()
        answer[score]++
    }
    for (i in answer.indices) {
        while (answer[i] > 0 && cnt < 7) {
            println("%.3f".format(i / 1000.0))
            answer[i]--
            cnt++
        }
    }
}