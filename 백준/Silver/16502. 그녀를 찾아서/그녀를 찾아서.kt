val res = DoubleArray(4)
val adj = Array(4) { mutableListOf<Pair<Int, Double>>() }

fun dfs(now: Int, p: Double, cnt: Int, n: Int) {
    if (cnt == n) {
        res[now] += p * 100
        return
    }

    for ((next, prob) in adj[now]) {
        dfs(next, p * prob, cnt + 1, n)
    }
}

fun main() {
    val n = readln().toInt()
    val m = readln().toInt()

    repeat(m) {
        val input = readln().split(" ")
        val s = input[0][0]
        val e = input[1][0]
        val p = input[2].toDouble()
        adj[s - 'A'].add(Pair(e - 'A', p))
    }

    for (i in 0..<4) {
        dfs(i, 0.25, 0, n)
    }

    for (i in 0..<4) {
        println("%.2f".format(res[i]))
    }
}