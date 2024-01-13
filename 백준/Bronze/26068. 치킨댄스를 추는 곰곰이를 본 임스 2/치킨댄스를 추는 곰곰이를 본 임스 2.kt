fun main() {
    val n = readLine()!!.toInt()
    var result = 0
    repeat(n) {
        val secondPart = readLine()!!.split("-")[1].toInt()
        if (secondPart <= 90) {
            result++
        }
    }
    println(result)
}