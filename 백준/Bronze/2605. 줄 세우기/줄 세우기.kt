fun main() {
    val n = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }
    val result = mutableListOf<Int>()
    for (i in 0..<n) {
        val position = result.size - nums[i]
        result.add(position, i + 1)
    }
    val sb = StringBuilder()
    for (num in result) {
        sb.append(num).append(" ")
    }
    println(sb)
}

