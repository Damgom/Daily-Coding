import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine()!!.toInt()
    repeat(t) {
        val input = br.readLine()!!.split(" ").map { it.toInt() }
        val evenNumbers = input.filter { it % 2 == 0 }
        val sum = evenNumbers.sum()
        val min = evenNumbers.minOrNull()
        println("$sum $min")
    }
}
