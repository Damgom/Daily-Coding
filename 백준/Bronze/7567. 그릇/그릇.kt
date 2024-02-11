fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine()!!
    var result = 10
    if (input.length == 1) {
        println(result)
        return
    }
    for (i in 0..<input.length - 1) {
        result += if (input[i] == input[i + 1]) {
            5
        } else 10
    }
    println(result)
}