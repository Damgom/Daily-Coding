fun main() {
    val t = readln().toInt()
    val sb = StringBuilder()
    repeat(t) {
        val n = readln().toInt()
        var sum = 0
        readln().split(" ").map {
            it.toInt()
            sum += it.toInt()
        }
        var day = 1;
        while (sum <= n) {
            sum *= 4
            ++day;
        }
        sb.append(day).append("\n")
    }
    println(sb)
}