fun main() {
    val (n, m, s) = readln().split(" ").map { it.toInt() }
    val arr = Array(n) {
        readln().split(" ").let { (x, y) -> x.toInt() to y.toInt() }
    }.sortedBy { it.first }

    fun solve(): Int? {
        for (i in 0..<n - 1) {
            val gap = arr[i + 1].first - arr[i].first - arr[i].second
            if (gap >= m) return arr[i].first + arr[i].second
        }
        return null
    }

    val result = when {
        arr[0].first >= m -> 0
        else -> solve() ?: run {
            val last = arr.last()
            if (last.first + last.second + m <= s) last.first + last.second else -1
        }
    }

    println(result)
}