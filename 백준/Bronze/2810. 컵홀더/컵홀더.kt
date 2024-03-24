import kotlin.math.min

fun main() {
    val n = readln().toInt()
    val seat = readln()
    val replaceSeat = seat.replace("LL", "S")
    println(min(seat.length, replaceSeat.length + 1))
}
