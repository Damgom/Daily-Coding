import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val N = br.readLine()!!.toInt()
    val sb = StringBuilder()
    repeat(N) {
        var input = br.readLine()!!
        input = input.substring(0, 1).uppercase(Locale.getDefault()) + input.substring(1)
        sb.append(input).append("\n")
    }
    println(sb)
}
