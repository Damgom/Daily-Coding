fun main() {
    val n = readln()
    val input = readln().split(" ").map { it.toInt() }
    var sum = 0
    var temp = input[0]
    for (i in 1..<input.size) {
        sum += temp * input[i]
        temp += input[i]
    }
    println(sum)
}