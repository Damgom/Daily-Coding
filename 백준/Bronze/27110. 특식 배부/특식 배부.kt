fun main() {
    val N = readLine()!!.toInt()
    val chiken = readLine()!!.split(" ").map { it.toInt() }
    var result = 0
    for (i in chiken.indices) {
        result += if (chiken[i] < N) {
            chiken[i]
        } else {
            N
        }
    }
    println(result)
}