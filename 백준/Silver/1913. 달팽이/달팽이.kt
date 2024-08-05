import java.io.BufferedReader
import java.io.InputStreamReader

var dx: IntArray = intArrayOf(1, 0, -1, 0)
var dy: IntArray = intArrayOf(0, 1, 0, -1)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val N = br.readLine().toInt()
    val A = br.readLine().toInt()
    val arr = Array(N) { IntArray(N) }
    var idx = 0
    var curX = 0
    var curY = 0

    arr[curX][curY] = N * N

    while (idx < 4) {
        val nx = curX + dx[idx]
        val ny = curY + dy[idx]
        if (nx >= 0 && ny >= 0 && nx < N && ny < N && arr[nx][ny] == 0) {
            arr[nx][ny] = arr[curX][curY] - 1
            if (arr[nx][ny] == 1) break
            curX = nx
            curY = ny
        } else {
            idx++
        }


        if (idx >= 4) {
            idx = 0
        }
    }
    var ansX = 0
    var ansY = 0
    for (i in 0..<N) {
        for (j in 0..<N) {
            if (arr[i][j] == A) {
                ansX = i + 1
                ansY = j + 1
            }
            sb.append(arr[i][j].toString() + " ")
        }
        sb.append("\n")
    }
    sb.append("$ansX $ansY")

    println(sb)
}
