import kotlin.math.sqrt

fun main() {
    val br = System.`in`.bufferedReader()
    val M = br.readLine()!!.toInt()
    val N = br.readLine()!!.toInt()
    var min = Int.MAX_VALUE
    var result = 0
    for (num in M..N) {
        if (isPrime(num)) {
            result += num
            if (num <= min) {
                min = num
            }
        }
    }
    if (min == Int.MAX_VALUE) {
        println(-1)
    } else {
        println(result)
        println(min)
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    return (2..sqrt(num.toDouble()).toInt()).none { num % it == 0}
}
