fun main() {
    val n = readln().toInt()
    repeat(n) {
        val input = readln().split(" ")
        var result = input[0].toDouble()
        for (i in 1..<input.size) {
            when (input[i]) {
                "@" -> result *= 3
                "%" -> result += 5
                "#" -> result -= 7
            }
        }
        println("%.2f".format(result))
    }
}
