import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    var count = 0
    while (true) {
        val input = readln()
        if (input == "0") break
        val (r, w, l) = input.split(" ").map { it.toInt() }
        val d = sqrt(w.toDouble().pow(2.0) + l.toDouble().pow(2.0))
        count++
        if ((2 * r) >= d) {
            println("Pizza $count fits on the table.")
        } else {
            println("Pizza $count does not fit on the table.")
        }
    }
}

