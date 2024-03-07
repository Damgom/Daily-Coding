fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (missIndex, str) = readln().split(" ")
        val result = StringBuilder()
        for (i in str.indices) {
            if (i != missIndex.toInt() - 1) {
                result.append(str[i])
            }
        }
        println(result)
    }
}
