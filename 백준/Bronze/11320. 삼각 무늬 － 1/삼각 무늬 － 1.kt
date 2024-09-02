fun main() {
    val n = readln().toInt()
    repeat(n) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        when {
            a % b == 0 -> println((a / b) * (a / b))
            else -> println((a / b) + 1 * (a / b) + 1)
        }
    }
}
