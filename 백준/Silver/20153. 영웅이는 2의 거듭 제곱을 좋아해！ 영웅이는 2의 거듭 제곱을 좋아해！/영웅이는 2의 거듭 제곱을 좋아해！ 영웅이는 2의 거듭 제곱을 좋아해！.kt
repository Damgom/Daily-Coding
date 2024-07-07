import kotlin.math.max

fun main() {
    readln().toInt()
    val input = readln().split(" ").map { it.toInt() }
    var t = 0
    var maxValue = 0
    for (i in input) {
        t = t xor i
    }
    for (i in input) {
        maxValue = max(maxValue, t xor i)
    }
    maxValue = max(maxValue, t)
    println("$maxValue$maxValue")
}