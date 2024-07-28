fun main() {
    val (R, C) = readln().split(" ").map { it.toInt() }
    val N = readln().toInt()
    val dolls = readln().split(" ").map { it.toInt() }.toMutableList()
    dolls.sort()
    val table = IntArray(C)
    var index = 0
    var count = 0

    for (height in dolls) {
        if (height > table[index]) {
            table[index] = height
            count++
            index = (index + 1) % C
        }
    }

    if (count > R * C) {
        count = R * C
    }
    println(count)
}