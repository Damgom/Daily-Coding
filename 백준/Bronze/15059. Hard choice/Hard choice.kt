fun main() {
    val serve = readLine()!!.split(" ").map{ it.toInt() }
    val request = readLine()!!.split(" ").map{ it.toInt() }
    var result = 0
    for (i in serve.indices) {
        result += maxOf(0, request[i] - serve[i])
    }
    println(result)
}