import kotlin.math.*

fun main() {
    val (a, b) = readln().split(" ").map { it.toLong() }
    val max = max(a, b)
    val min = min(a, b)
    val maxSum = max * (max + 1) / 2
    val minSum = (min - 1) * min / 2
    println(maxSum - minSum)
}
