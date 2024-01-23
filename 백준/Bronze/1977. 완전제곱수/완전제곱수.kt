import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val M = br.readLine()!!.toInt()
    val N = br.readLine()!!.toInt()
    var sum = 0
    var min = -1
    for (i in M..N) {
        val sqrtNum = sqrt(i.toDouble()).toInt()
        if (sqrtNum * sqrtNum == i) {
            sum += i
            if (min == -1 || i < min) {
                min = i
            }
        }
    }
    if (min == -1) {
        println(-1)
    } else {
        println(sum)
        println(min)
    }
}
