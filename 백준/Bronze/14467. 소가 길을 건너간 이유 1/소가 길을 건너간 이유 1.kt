fun main() {
    val n = readln().toInt()
    val cows = IntArray(11) { 2 }
    var count = 0
    repeat(n) {
        val (cowNum, location) = readln().split(" ").map { it.toInt() }
        if (cows[cowNum] != 2 && cows[cowNum] != location) {
            cows[cowNum] = location
            count++
        } else if (cows[cowNum] == 2) {
            cows[cowNum] = location
        }
    }
    println(count)
}