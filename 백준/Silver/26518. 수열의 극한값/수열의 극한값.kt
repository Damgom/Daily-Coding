import kotlin.math.sqrt

fun main() {
    val (b, c, a1, a2) = readln().split(" ").map { it.toLong() }
    println((b + sqrt((b * b + 4.0 * c))) / 2.0)
}