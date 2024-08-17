import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val problem = readLine()!!
    var count = 1

    for (i in 1 until problem.length) {
        if (problem[i] != problem[i-1]) count++
    }

    println(count / 2 + 1)
}