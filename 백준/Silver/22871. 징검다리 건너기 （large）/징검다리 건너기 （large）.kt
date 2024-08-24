import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

var n = 0
var arr = LongArray(0)
var dp = LongArray(0)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    n = br.readLine().toInt()
    dp = LongArray(n) { -1L }
    arr = br.readLine().split(" ").map { it.toLong() }.toLongArray()

    println(jump(0))
}

fun jump(x: Int): Long {
    if (x == n - 1) return 0
    if (dp[x] != -1L) {
        return dp[x]
    }
    dp[x] = Long.MAX_VALUE

    for (i in x + 1..<n) {
        dp[x] = min(dp[x], max(jump(i), ((i - x) * (1 + abs(arr[x] - arr[i])))))
    }
    return dp[x]
}