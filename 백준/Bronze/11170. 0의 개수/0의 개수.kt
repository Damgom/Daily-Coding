fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (n, m) = readln().split(" ").map { it.toInt() }
        countZero(n, m)
    }
}

fun countZero(n: Int, m: Int) {
    var count = 0
    for (i in n..m) {
        val str = i.toString()
        for (j in str.indices) {
            if (str[j].toString() == "0") {
                count++
            }
        }
    }
    println(count)
}

