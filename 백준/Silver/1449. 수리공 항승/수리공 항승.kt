fun main() {
    val (n, l) = readln().split(" ").map { it.toInt() }
    val arr = readln().split(" ").map { it.toInt() }.toMutableList()
    arr.sort()
    var tapeStart = arr[0] - 0.5
    var count = 1
    for (tape in arr) {
        if (tapeStart + l < tape) {
            count++
            tapeStart = tape - 0.5
        }
    }
    println(count)
}
