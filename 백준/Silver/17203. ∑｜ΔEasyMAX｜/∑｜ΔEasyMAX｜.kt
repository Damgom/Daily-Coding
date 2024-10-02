import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, q) = br.readLine().split(" ").map { it.toInt() }
    val arr = br.readLine().split(" ").map { it.toInt() }
    repeat(q) {
        val (start, end) = br.readLine().split(" ").map { it.toInt() }
        if (start == end) {
            println(0)
        } else {
            var result = 0
            for (i in start..<end) {
                result += abs(arr[i] - arr[i - 1])
            }
            println(result)
        }
    }
}
