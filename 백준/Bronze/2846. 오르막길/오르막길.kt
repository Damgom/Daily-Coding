import kotlin.math.max

fun main() {
    val n = readln()
    val pi = readln().split(" ").map { it.toInt() }
    var uphillHeight = 0
    var temp = 0
    for (i in 1..<pi.size) {
        if (pi[i - 1] < pi[i]) {
            temp += pi[i] - pi[i - 1]
        } else {
            temp = 0
        }
        uphillHeight = max(temp, uphillHeight)
    }
    println(uphillHeight)
}