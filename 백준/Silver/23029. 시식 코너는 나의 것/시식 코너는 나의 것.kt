fun main() {
    val n = readln().toInt()
    val food = IntArray(n) { readln().toInt() }

    if (n == 1) {
        println(food[0])
        return
    }
    val dp = Array(n) { IntArray(3) }
    dp[0][0] = 0
    dp[0][1] = food[0]
    dp[0][2] = 0
    for (i in 1.until(n)) {
        dp[i][0] = maxOf(dp[i - 1][0], dp[i - 1][1], dp[i - 1][2])
        dp[i][1] = dp[i - 1][0] + food[i]
        dp[i][2] = dp[i - 1][1] + food[i] / 2
    }
    println(maxOf(dp[n - 1][0], dp[n - 1][1], dp[n - 1][2]))
}
