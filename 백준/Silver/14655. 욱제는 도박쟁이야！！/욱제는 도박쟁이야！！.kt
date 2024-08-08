import kotlin.math.abs

fun main() {
    val n = readln().toInt()
    var result = 0
    readln().split(" ").map { result += abs(it.toInt()) }
    readln().split(" ").map { result += abs(it.toInt()) }

    println(result)
}
