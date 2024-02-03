import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val (number, radix) = br.readLine()!!.split(" ").map { it.toInt() }
    println(number.toString(radix).uppercase(Locale.getDefault()))
}
