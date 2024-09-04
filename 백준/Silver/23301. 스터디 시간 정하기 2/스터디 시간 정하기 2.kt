import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, t) = br.readLine().split(" ").map { it.toInt() }
    val intervals = mutableListOf<Pair<Int, Int>>()
    repeat(n) {
        val k = br.readLine().toInt()
        repeat(k) {
            val (s, e) = br.readLine().split(" ").map { it.toInt() }
            intervals.add(Pair(s, e))
        }
    }
    var maxValue = 0
    var bestStart = 0

    for (start in 0..1000 - t) {
        val end = start + t
        var satisfaction = 0

        for ((s, e) in intervals) {
            if (e > start && s < end) {
                satisfaction += minOf(e, end) - maxOf(s, start)
            }
        }
        if (satisfaction > maxValue) {
            maxValue = satisfaction
            bestStart = start
        }
    }
    println("$bestStart ${bestStart + t}")
}
