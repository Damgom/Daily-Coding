fun main() {
    var (n, k) = readln().split(" ").map { it.toInt() }
    val minValue = minValue(k)
    if (minValue > n) {
        println("-1")
    } else {
        var answer = k - 1
        n -= minValue
        if (n % k != 0) {
            answer++
        }
        println(answer)
    }
}

fun minValue(k: Int): Int {
    var sum = 0
    for (i in 1..k) {
        sum += i
    }
    return sum
}