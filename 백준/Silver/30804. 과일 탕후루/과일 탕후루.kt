import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val N = br.readLine().toInt()
    val fruits = br.readLine().split(" ").map { it.toInt() }

    val fruitsCnt = HashMap<Int, Int>()
    var maxLength = 0
    var start = 0

    for (end in 0..<N) {
        fruitsCnt[fruits[end]] = fruitsCnt.getOrDefault(fruits[end], 0) + 1
        while (fruitsCnt.size > 2) {
            fruitsCnt[fruits[start]] = fruitsCnt[fruits[start]]!! - 1
            if (fruitsCnt[fruits[start]] == 0) {
                fruitsCnt.remove(fruits[start])
            }
            start++
        }
        maxLength = max(maxLength.toDouble(), (end - start + 1).toDouble()).toInt()
    }
    println(maxLength)
}
