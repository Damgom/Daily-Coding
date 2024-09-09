import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

var st: StringTokenizer? = null
var N = 0
var M = 0
var start = 0
var end = 0
var map = Array(26) { IntArray(26) }

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    N = br.readLine().toInt()
    for (i in 0..25) {
        for (j in 0..25) {
            if (i != j) map[i][j] = 1000
        }
    }
    for (i in 0.until(N)) {
        st = StringTokenizer(br.readLine())
        start = st!!.nextToken()[0].code - 'a'.code
        st!!.nextToken()
        end = st!!.nextToken()[0].code - 'a'.code
        map[start][end] = 1
    }
    for (k in 0..25) {
        for (i in 0..25) {
            if (i == k) continue
            for (j in 0..25) {
                if (i == j || k == j) continue
                map[i][j] =
                    min(map[i][j].toDouble(), (map[i][k] + map[k][j]).toDouble())
                        .toInt()
            }
        }
    }
    M = br.readLine().toInt()
    for (i in 0 until M) {
        st = StringTokenizer(br.readLine())
        start = st!!.nextToken()[0].code - 'a'.code
        st!!.nextToken()
        end = st!!.nextToken()[0].code - 'a'.code
        if (map[start][end] != 0 && map[start][end] < 1000)
            println("T") else println("F")
    }
}
