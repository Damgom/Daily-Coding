fun main() {
    val input = readln().split(" ").map { it.toInt() }
    var count = 0
    val compare = input[0]
    for (i in 1..<input.size) {
        if (compare - input[i] <= 1000) {
            count++
        }
    }
    println(count)
}