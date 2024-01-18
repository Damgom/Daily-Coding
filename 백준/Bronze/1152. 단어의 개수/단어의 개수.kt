import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val input = br.readLine()
    val string = input.trim()
    if (string.isNotEmpty()) {
        val result = string.split(" ")
        println(result.size)
    } else println(0)
}
