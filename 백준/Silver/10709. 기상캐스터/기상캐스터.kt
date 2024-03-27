fun main() {
    val (h, w) = readln().split(" ").map { it.toInt() }
    repeat(h) {
        val cloudInfo = readln()
        var count = 0
        var cloudExist = false
        val result = mutableListOf<Int>()
        for (char in cloudInfo) {
            if (char == 'c') {
                count = 0
                cloudExist = true
            } else if (cloudExist) {
                count++
            } else {
                count = -1
            }
            result.add(count)
        }
        println(result.joinToString(" "))
    }
}
