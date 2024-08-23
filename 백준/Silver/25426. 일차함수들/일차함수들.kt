fun main() {
    val N = readln().toInt()
    val aArray = LongArray(N)
    var bSum = 0L
    for (i in 0..<N) {
        val (a, b) = readln().split(" ").map { it.toLong() }
        aArray[i] = a
        bSum += b
    }
    aArray.sort()
    var aSum = 0L
    for (i in 1..N) {
        aSum += i * aArray[i - 1]
    }
    println(aSum + bSum)
}
