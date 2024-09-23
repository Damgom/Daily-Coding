import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val dp = LongArray(68)
    val sb = StringBuilder()
    dp[0] = 1
    dp[1] = 1
    dp[2] = 2
    dp[3] = 4
    for (i in 4..67) {
        dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4]
    }
    for (i in 0..<t) {
        val n = br.readLine().toInt()
        sb.append(dp[n].toString() + "\n")
    }
    print(sb)
}
