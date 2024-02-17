fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine()!!.toInt()

    while (true) {
        val target = br.readLine()!!.toInt()
        if (target == 0) break

        println(
            when (target % n) {
                0 -> "$target is a multiple of $n."
                else -> "$target is NOT a multiple of $n."
            }
        )
    }
}
