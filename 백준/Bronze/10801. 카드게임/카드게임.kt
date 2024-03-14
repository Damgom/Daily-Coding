fun main() {
    val a = readln().split(" ").map { it.toInt() }
    val b = readln().split(" ").map { it.toInt() }
    var count = 0
    for (i in a.indices) {
        if (a[i] > b[i]) {
            count++
        } else if (a[i] < b[i]) {
            count--
        }
    }
    println(if (count > 0) "A" else if (count < 0) "B" else "D")
}
