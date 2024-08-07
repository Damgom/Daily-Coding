import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()

    val map = Array(n) { CharArray(n) }
    val mine = Array(n) { CharArray(n) }
    val dx = intArrayOf(-1, -1, -1, 0, 0, 1, 1, 1)
    val dy = intArrayOf(-1, 0, 1, -1, 1, -1, 0, 1)

    for (i in 0..<n) {
        val temp = br.readLine()
        for (j in 0..<n) {
            map[i][j] = temp[j]
        }
    }

    for (i in 0..<n) {
        for (j in 0..<n) {
            var count = 0
            if (map[i][j] != '.') {
                mine[i][j] = '*'
                continue
            } else {
                for (k in 0..<8) {
                    val nextI = i + dx[k]
                    val nextJ = j + dy[k]
                    if (nextI < 0 || nextI >= n || nextJ < 0 || nextJ >= n) continue
                    if (map[nextI][nextJ] > '0') {
                        count += map[nextI][nextJ] - '0'
                    }
                }
            }
            mine[i][j] = if (count < 10) (count + '0'.code).toChar() else 'M'
        }
    }

    for (i in 0..<n) {
        println(mine[i].joinToString(""))
    }
}