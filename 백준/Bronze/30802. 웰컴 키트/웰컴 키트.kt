import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }
    val (t, p) = br.readLine().split(" ").map { it.toInt() }

    var count = 0
    for (i in 0..5) {
        count += a[i] / t
        if (a[i] % t != 0) {
            count++
        }
    }
    println(count)
    println((n / p).toString() + " " + n % p)
}
