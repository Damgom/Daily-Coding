fun main() {
    val s = readLine()!!.toInt()
    val m = readLine()!!.toInt()
    val l = readLine()!!.toInt()
    val happiness = s + 2 * m + 3 * l
    println(if (happiness >= 10) "happy" else "sad")
}
