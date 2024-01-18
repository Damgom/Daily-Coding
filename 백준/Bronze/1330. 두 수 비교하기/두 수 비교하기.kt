import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (x, y) = br.readLine()!!.split(" ").map { it.toInt() }
    when {
        x > y -> println(">")
        x < y -> println("<")
        else -> println("==")
    }
}
