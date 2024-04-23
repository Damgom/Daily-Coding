fun main() {
    val T = readln().toInt()
    val testCase = IntArray(T) { readln().toInt() }

    val dp = Array(41) { IntArray(2) }
    dp[0][0] = 1
    dp[0][1] = 0
    dp[1][0] = 0
    dp[1][1] = 1

    for (i in 2..<41) {
        dp[i][0] = dp[i - 1][0] + dp[i - 2][0]
        dp[i][1] = dp[i - 1][1] + dp[i - 2][1]
    }

    for (i in testCase.indices) {
        println("${dp[testCase[i]][0]} ${dp[testCase[i]][1]}")
    }
}