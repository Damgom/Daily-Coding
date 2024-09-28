import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    repeat(t) {
        val n = br.readLine().toInt()
        val stores = br.readLine().split(" ").map { it.toInt() }.toMutableList()
        stores.sort()
        println((stores[n - 1] - stores[0]) * 2)
    }
}
