import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val averages = IntArray(n) { br.readLine().replace(".", "").toInt() }

    for (people in 1..1000) {
        if (isPossibleCnt(people, averages)) {
            println(people)
            return
        }
    }
}

fun isPossibleCnt(count: Int, averages: IntArray): Boolean {
    for (avg in averages) {
        var left = 0
        var right = 10 * count
        while (left <= right) {
            val sumOfScore = (left + right) / 2
            val currentAvg = (sumOfScore * 1000) / count
            when {
                currentAvg == avg -> {
                    if (currentAvg <= 10000) break
                    right = sumOfScore - 1
                }
                currentAvg > avg -> right = sumOfScore - 1
                else -> left = sumOfScore + 1
            }
        }
        if (left > right) return false
    }
    return true
}