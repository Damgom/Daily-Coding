fun main() {
    while (true) {
        val n = readln().toInt()
        if (n == 0) break
        val input = readln()
        val printed = BooleanArray(1001)

        for (range in input.split(",")) {
            if ("-" !in range) {
                val num = range.toInt()
                if (num <= n) printed[num] = true
            } else {
                val (a, b) = range.split("-").map { it.toInt() }
                for (i in a..minOf(b, n)) {
                    printed[i] = true
                }
            }
        }

        println(printed.count { it })
    }
}