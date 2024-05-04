import java.lang.Double.min

fun main() {
    val N = readln().toInt()
    val a = ArrayList<ArrayList<Int>>()
    for (i in 0..N) {
        a.add(ArrayList())
    }
    for (i in 0..<N) {
        val (point, color) = readln().split(" ").map { it.toInt() }
        a[color].add(point)
    }
    for (i in 0..N) {
        a[i].sort()
    }

    var ans = 0
    for (i in 0..N) {
        for (j in a[i].indices) {
            when (j) {
                0 -> {
                    ans += a[i][j + 1] - a[i][j]
                }
                a[i].size - 1 -> {
                    ans += a[i][j] - a[i][j - 1]
                }
                else -> {
                    val t = a[i][j + 1] - a[i][j]
                    val f = a[i][j] - a[i][j - 1]

                    ans += (min(t.toDouble(), f.toDouble())).toInt()
                }
            }
        }
    }
    println(ans.toString())
}
