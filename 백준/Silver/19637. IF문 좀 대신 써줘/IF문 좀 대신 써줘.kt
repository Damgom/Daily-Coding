fun main() {
    val sb = StringBuilder()
    val (n, m) = readln().split(" ").map { it.toInt() }
    val str = arrayOfNulls<String>(n)
    val combatPower = IntArray(n)

    for (i in 0..<n) {
        val input = readln().split(" ")
        str[i] = input[0]
        combatPower[i] = input[1].toInt()
    }

    for (i in 0..<m) {
        val num = readln().toInt()
        var start = 0
        var last = n - 1
        while (start <= last) {
            val mid = (start + last) / 2

            if (combatPower[mid] < num) {
                start = mid + 1
            } else {
                last = mid - 1
            }
        }
        sb.append(str[start]).append("\n")
    }
    println(sb.toString())
}
