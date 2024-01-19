import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine()!!.toInt()
    val first = intArrayOf(500, 300, 300, 200, 200, 200, 50, 50, 50, 50, 30, 30, 30, 30, 30, 10, 10, 10, 10, 10, 10)
    val second = intArrayOf(512, 256, 256, 128, 128, 128, 128, 64, 64, 64, 64, 64, 64, 64, 64,
        32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32)

    repeat(T) {
        var money = 0
        val (a, b) = br.readLine()!!.split(" ").map { it.toInt() }
        if (a in 1..21)
            money += first[a - 1]
        if (b in 1..31)
            money += second[b - 1]

        println(money * 10000)
    }
}
