fun main() {
    val n = readln().toInt()
    val sb = StringBuilder()

    for (i in 0..<n) {
        val input = readln().split(" ")
        val m = input[1].toInt()

        var a = 1
        var b = 1
        var count = 0

        while (true) {
            val next = (a + b) % m
            a = b
            b = next
            count++

            if (a == 1 && b == 1) {
                break
            }
        }

        sb.append("${i + 1} $count\n")
    }
    println(sb)
}