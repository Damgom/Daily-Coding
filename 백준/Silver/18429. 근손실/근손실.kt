import java.util.*

fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val kit = readln().split(" ").map { it.toInt() }
    val visited = BooleanArray(N) { false }
    var answer = 0

    fun dfs(depth: Int, weight: Int) {
        if (depth == N) {
            answer++
            return
        }
        if (weight < 500) {
            return
        }
        for (i in 0..<N) {
            if (!visited[i]) {
                visited[i] = true
                dfs(depth + 1, weight + kit[i] - K)
                visited[i] = false
            }
        }
    }

    dfs(0, 500)
    println(answer)
}