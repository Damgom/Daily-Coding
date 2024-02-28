import kotlin.math.*

fun main() {
    val N = readln().toDouble()
    if (isPowerOfTwo(N)) {
        println("1")
    } else {
        println("0")
    }
}

fun isPowerOfTwo(n: Double): Boolean {
    if (n <= 0) return false
    val power = (log2(n)).toInt()
    return 2.0.pow(power) == n
}
