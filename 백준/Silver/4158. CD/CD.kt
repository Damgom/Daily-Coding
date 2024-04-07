fun main() {
    while (true) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        if (n == 0 && m == 0) break
        val sangeun = HashSet<Int>(n)
        val sunyoung = HashSet<Int>(m)
        repeat(n) {
            sangeun.add(readln().toInt())
        }
        repeat(m) {
            sunyoung.add(readln().toInt())
        }
        val intersection = sangeun.intersect(sunyoung)
        println(intersection.size)
    }
}
