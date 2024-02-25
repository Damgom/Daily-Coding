fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val str = readln()
    val sortedArr = input.sorted()
    val sb = StringBuilder()
    for (char in str) {
        sb.append(sortedArr[char - 'A']).append(" ")
    }
    println(sb)
}
