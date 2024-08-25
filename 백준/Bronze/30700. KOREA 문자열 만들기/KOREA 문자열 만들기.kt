import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val S = br.readLine()
    val standard = charArrayOf('K', 'O', 'R', 'E', 'A')
    var count = 0
    var index = 0
    for (c in S) {
        if (c == standard[index]) {
            index++
            count++
        }
        if (index == 5) index = 0
    }
    println(count)
}
