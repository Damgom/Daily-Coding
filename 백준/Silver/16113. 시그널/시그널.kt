import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


lateinit var map: Array<CharArray>
lateinit var check: Array<BooleanArray>
var n = 0
var dx = intArrayOf(0, 1, 0, -1)
var dy = intArrayOf(1, 0, -1, 0)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    n = br.readLine().toInt()
    val answer = StringBuilder()
    val cmd = br.readLine()
    map = Array(5) { CharArray(n / 5) }
    check = Array(5) { BooleanArray(n / 5) }
    var idx = 0
    for (i in 0..4) {
        for (j in 0 until n / 5) {
            val now = cmd[idx]
            map[i][j] = now
            idx++
        }
    }
    var cnt = 0
    for (i in 0 until n / 5) {
        if (map[0][i] == '#' && !check[0][i]) cnt = bfs(0, i)
        when (cnt) {
            5 -> answer.append(1)
            7 -> answer.append(7)
            9 -> answer.append(4)
            13 -> answer.append(
                8
            )
            12, 11 -> answer.append(
                search(cnt, i)
            )
        }
        cnt = 0
    }
    println(answer.toString())
}

fun bfs(x: Int, y: Int): Int {
    var cnt = 0
    val queue: Queue<IntArray> = LinkedList()
    check[x][y] = true
    queue.add(intArrayOf(x, y))
    while (queue.isNotEmpty()) {
        val now = queue.poll()
        cnt++
        for (i in 0..3) {
            val nx = now[0] + dx[i]
            val ny = now[1] + dy[i]
            if (nx < 0 || ny < 0 || nx >= 5 || ny >= n / 5) continue
            if (map[nx][ny] == '.' || check[nx][ny]) continue
            queue.add(intArrayOf(nx, ny))
            check[nx][ny] = true
        }
    }
    return cnt
}

fun search(cnt: Int, start: Int): Int {
    var answer = 0
    if (cnt == 11) {
        answer = if (map[3][start] == '#') 2 else if (map[1][start] == '#') 5 else 3
    } else if (cnt == 12) {
        answer = if (map[1][start + 2] == '.') 6 else if (map[3][start] == '.') 9 else 0
    }
    return answer
}
