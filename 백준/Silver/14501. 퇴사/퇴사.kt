import kotlin.math.max

fun main() {
    val n = readln().toInt()
    val t = IntArray(n)
    val p = IntArray(n)
    for (i in 0..<n) {
        val input = readln().split(" ").map { it.toInt() }
        t[i] = input[0]
        p[i] = input[1]
    }
    val dp = IntArray(n + 1)
    for (i in 0..<n) {
        //일하는날
        val day = i + t[i]
        if (day <= n) {
            dp[day] = max(dp[day].toDouble(), (dp[i] + p[i]).toDouble()).toInt()
        }
        dp[i + 1] = max(dp[i + 1].toDouble(), dp[i].toDouble()).toInt()
    }
    println(dp[n])
}
