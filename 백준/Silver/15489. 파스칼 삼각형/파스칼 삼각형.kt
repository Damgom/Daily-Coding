import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (r, c, w) = br.readLine().split(" ").map { it.toInt() }
    val dp = Array(r + w + 1) { IntArray(r + w + 1) }
    dp[1][1] = 1
    for (i in 2..r + w) {
        for (j in 1..i) {
            dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j]
        }
    }
    var sum = 0
    for (i in 0..<w) {
        for (j in 0..i) {
            sum += dp[r + i][c + j]
        }
    }
    print(sum)
}
