import kotlin.math.max

fun main() {
    val n = readln().toInt()
    var result = 0
    repeat(n) {
        val (a, d, g) = readln().split(" ").map { it.toInt() }
        var score = a * (d + g)
        if (a == d + g) {
            score *= 2
        }
        result = max(result, score)
    }
    println(result)
}
