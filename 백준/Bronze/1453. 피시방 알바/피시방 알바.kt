fun main() {
    val n = readln().toInt()
    val wantedSeats = readln().split(" ").map { it.toInt() }
    val seats = BooleanArray(100)
    var count = 0
    for (seat in wantedSeats) {
        if (seats[seat - 1]) {
            count++
        } else {
            seats[seat - 1] = true
        }
    }
    println(count)
}
