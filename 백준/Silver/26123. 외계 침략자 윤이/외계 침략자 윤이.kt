import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, d) = br.readLine().split(" ").map { it.toInt() }
    val building = br.readLine().split(" ").map { it.toInt() }
    val map = mutableMapOf<Int, Int>()
    var result = 0L
    for (i in building) {
        map[i] = map.getOrDefault(i, 0) + 1
    }
    var max = map.keys.maxOrNull() ?: 0
    repeat(d) {
        if (max == 0) {
            println(result)
            return
        }
        result += map[max] ?: 0
        map[max - 1] = (map[max - 1] ?: 0) + (map[max] ?:0)
        max--
    }
    println(result)
}
