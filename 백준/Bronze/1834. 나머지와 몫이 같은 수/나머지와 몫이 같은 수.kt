fun main() {
    val n = readln().toLong()
    var sum: Long = 0
    for (i in 0..<n) {
        sum += (n + 1) * i
    }
    println(sum)
}