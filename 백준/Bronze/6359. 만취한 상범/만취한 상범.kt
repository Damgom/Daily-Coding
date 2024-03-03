fun main() {
    val T = readln().toInt()
    repeat(T) {
        val n = readln().toInt()
        val escaped = countEscaped(n)
        println(escaped)
    }
}

fun countEscaped(n: Int): Int {
    val cells = BooleanArray(n) { true }
    for (round in 2..n) {
        for (cell in round..n step round) {
            cells[cell - 1] = !cells[cell - 1]
        }
    }
    return cells.count { it }
}
