fun main() {
    val br = System.`in`.bufferedReader()
    val testcase = br.readLine()!!.toInt()
    val sb = StringBuilder()
    repeat(testcase) {
        val (c, v) = br.readLine()!!.split(" ").map { it.toInt() }
        sb.append("You get ${c / v} piece(s) and your dad gets ${c % v} piece(s).\n")
    }
    print(sb)
}
