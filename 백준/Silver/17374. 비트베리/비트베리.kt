import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    repeat(t) {
        var p = sc.nextInt()
        val q = sc.nextInt()
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()
        val d = sc.nextInt()

        var coin = (q / c) * d
        p += (coin / b) * a
        coin %= b
        val x = (p - coin) / (a + b)
        val ans = maxOf(
            minOf(coin + (b * x), p - (a * x)),
            minOf(coin + (b * (x + 1)), p - (a * (x + 1)))
        )

        println(ans)
    }
}
