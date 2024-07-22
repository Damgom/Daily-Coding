fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }.sortedDescending()
    var num = 0L
    for (i in 0..<n) {
        num += 2L * (n - 1 - 2 * i) * nums[i]
    }

    println(num)
}