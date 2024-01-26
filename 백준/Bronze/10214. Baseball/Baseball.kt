fun main() {
    val br = System.`in`.bufferedReader()
    val T = br.readLine().toInt()
    repeat(T) {
        var yonsei = 0
        var korea = 0
        repeat(9) {
            val (y, k) = br.readLine().split(" ").map { it.toInt() }
            yonsei += y
            korea += k
        }
        val result = when {
            yonsei > korea -> "Yonsei"
            yonsei < korea -> "Korea"
            else -> "Draw"
        }
        println(result)
    }
}
