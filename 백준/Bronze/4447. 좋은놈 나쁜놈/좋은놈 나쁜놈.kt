import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    while (n-- > 0) {
        val name = br.readLine()
        var g = 0
        var b = 0
        for (element in name) {
            when (element) {
                'g', 'G' -> g++
                'b', 'B' -> b++
            }
        }
        val print = if (g == b) "NEUTRAL" else if (g < b) "A BADDY" else "GOOD"
        println("$name is $print")
    }
}
