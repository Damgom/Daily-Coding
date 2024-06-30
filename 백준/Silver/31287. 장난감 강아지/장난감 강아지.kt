fun main() {
    val dx = mapOf('U' to 0, 'D' to 0, 'L' to -1, 'R' to 1)
    val dy = mapOf('U' to 1, 'D' to -1, 'L' to 0, 'R' to 0)

    val (n, k) = readln().split(" ").map { it.toInt() }
    val command = readln()

    var x = 0
    var y = 0
    val curLocation = command.map { c ->
        x += dx.getValue(c)
        y += dy.getValue(c)
        Pair(x, y)
    }.toSet()

    val result = (0..<minOf(n, k)).any { i ->
        Pair(-x * i, -y * i) in curLocation
    }

    println(if (result) "YES" else "NO")
}