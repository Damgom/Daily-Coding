fun main() {
    var n = readln().toInt()
    val sb = StringBuilder()
    while (n-- > 0) {
        val bracket = readln()
        var count = 0
        for (element in bracket) {
            if (element == '(') {
                count++
            } else count--
            if (count < 0) {
                break
            }
        }
        if (count == 0) {
            sb.append("YES").append("\n")
        } else sb.append("NO").append("\n")
    }
    println(sb)
}
