fun main() {
    val br = System.`in`.bufferedReader()
    val T = br.readLine()!!.toInt()
    val sb = StringBuilder()
    repeat(T) {case ->
        val (x, y) = br.readLine()!!.split(" ").map { it.toInt() }
        sb.append("Case ${case + 1}: ${x + y}").append("\n")
    }
    println(sb)
}
