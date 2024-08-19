fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val graph = Array(n + 1) { mutableListOf<Int>() }
    val visited = BooleanArray(n + 1) { false }

    repeat(m) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        graph[b].add(a)
    }

    val x = readln().toInt()
    var count = 0

    fun dfs(v: Int) {
        visited[v] = true
        for (i in graph[v]) {
            if (!visited[i]) {
                count++
                dfs(i)
            }
        }
    }

    dfs(x)
    println(count)
}
