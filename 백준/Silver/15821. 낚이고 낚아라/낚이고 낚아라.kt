import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val N = scanner.nextInt()
    val K = scanner.nextInt()

    val dist = LongArray(N)

    for (i in 0..<N) {
        var cur = 0L
        val P = scanner.nextInt()
        repeat(P) {
            val x = scanner.nextLong()
            val y = scanner.nextLong()
            cur = maxOf(cur, x * x + y * y)
        }
        dist[i] = cur
    }

    dist.sort()

    println("${dist[K - 1]}.00")
}
