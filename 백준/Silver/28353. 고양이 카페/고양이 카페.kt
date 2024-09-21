import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val catWeights = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    catWeights.sort()
    var start = 0
    var end = catWeights.size - 1
    var count = 0
    while (start < end) {
        if (catWeights[start] + catWeights[end] > k) {
            end--
        } else {
            start++
            end--
            count++
        }
    }
    println(count)
}