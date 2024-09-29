import java.io.*
import java.util.*

private var map = Array(101) { IntArray(101) }

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (N, M) = br.readLine().split(" ").map { it.toInt() }
    var ans = 0
    for (i in 0..<N) {
        map[i] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }
    val list: MutableList<Int> = ArrayList()
    for (i in 0 until N) {
        for (j in 0 until M) {
            if (map[i][j] != 0) {
                list.add(map[i][j])
            } else if (map[i][j] == 0 && list.isNotEmpty()) {
                ans += processList(list)
                list.clear()
            }
        }
        if (list.isNotEmpty()) {
            ans += processList(list)
        }
        list.clear()
    }
    println(ans)
}

private fun processList(list: MutableList<Int>): Int {
    if (!list.contains(2) || !list.contains(1)) return 1

    var oneColor = 0
    var twoColor = 0

    var preColor = list[0]
    if (preColor == 1) oneColor++ else twoColor++

    for (i in 1 until list.size) {
        val nowColor = list[i]
        if (nowColor != preColor) {
            if (nowColor == 1) oneColor++ else twoColor++
        }
        preColor = nowColor
    }

    return oneColor.coerceAtMost(twoColor) + 1
}
