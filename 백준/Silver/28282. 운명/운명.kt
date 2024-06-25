import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val X = scanner.nextLong()
    val K = scanner.nextLong()

    val L = LongArray(10001)
    val R = LongArray(10001)

    repeat(X.toInt()) {
        val x = scanner.nextInt()
        L[x]++
    }

    repeat(X.toInt()) {
        val x = scanner.nextInt()
        R[x]++
    }

    var ans = X * X

    for (i in 1..K.toInt()) {
        ans -= L[i] * R[i]
    }

    println(ans)
}