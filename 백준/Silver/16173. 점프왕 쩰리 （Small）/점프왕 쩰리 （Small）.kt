import java.io.BufferedReader
import java.io.InputStreamReader

private var N: Int = 0
private lateinit var arr: Array<IntArray>
private lateinit var visited: Array<BooleanArray>
private val dx = intArrayOf(0, 1)
private val dy = intArrayOf(1, 0)
private var flag = false

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    N = br.readLine().toInt()
    arr = Array(N) { IntArray(N) }
    visited = Array(N) { BooleanArray(N) }

    repeat(N) { i ->
        arr[i] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    dfs(0, 0)

    println(if (flag) "HaruHaru" else "Hing")
}

private fun dfs(i: Int, j: Int) {
    if (arr[i][j] == -1) {
        flag = true
        return
    }

    for (k in 0..1) {
        val x = i + dx[k] * arr[i][j]
        val y = j + dy[k] * arr[i][j]
        if (x >= N || y >= N || visited[x][y]) continue

        visited[x][y] = true
        dfs(x, y)
    }
}
