import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine()!!.toInt()
    repeat(t) {
        val carPrice = br.readLine()!!.toInt()
        val options = br.readLine()!!.toInt()
        var result = carPrice
        repeat(options) {
            val (option, price) = br.readLine()!!.split(" ").map { it.toInt() }
            result += option * price
        }
        println(result)
    }
}
