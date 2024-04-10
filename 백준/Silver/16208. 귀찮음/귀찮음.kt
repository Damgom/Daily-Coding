fun main() {
    val n = readln().toInt()
    var total = 0L
    val stick = readln().split(" ").map { value ->
        val longValue = value.toLong()
        total += longValue
        longValue
    }
    var result = 0L
    for (i in stick.indices) {
        total -= stick[i]
        result += stick[i] * total
    }
    print(result)
}