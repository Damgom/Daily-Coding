fun main() {
    val t = readln().toInt()
    for (i in 0..<t) {
        val (n, m, k) = readln().split(" ").map { it.toInt() }
        if (k == 1 && m == 1 && n > m) {
            println(-1)
            continue
        }

        var a = n
        var b = m
        var c = 0
        var count = 0

        while (c < n) {
            val x = minOf(k * m, a)
            a -= x
            c += x
            count += 1

            if (c == n) {
                break
            }

            a += 1
            c -= 1
            count += 1
        }

        println(count)
    }
}
