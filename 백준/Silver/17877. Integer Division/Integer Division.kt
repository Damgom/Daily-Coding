fun main() {
    val (n, d) = readln().split(" ").map { it.toInt() }
    val map = mutableMapOf<Int, Int>()
    val input = readln().split(" ").map { it.toInt() }
    for (num in input) {
        map[num / d] = map.getOrDefault(num / d, 0) + 1
    }
    var ans = 0L
    for ((_, cnt) in map) {
        if (cnt > 0) {
            ans += (cnt.toLong() * (cnt - 1)) / 2
        }
    }
    println(ans)
}