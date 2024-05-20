fun main() {
    val n = readln().toInt()
    val input = readln().split(" ").map { it.toInt() }.toMutableList()
    input.sort()
    println(input[(n - 1) / 2])
}
