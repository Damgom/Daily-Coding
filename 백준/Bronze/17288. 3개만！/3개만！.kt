fun main() {
    val s = readln()
    var compare = s[0].toString()
    var count = 0
    for (i in 1..<s.length) {
        if (s[i] - s[i - 1] == 1) {
            compare += s[i]
        } else {
            if (compare.length == 3) count++
            compare = s[i].toString()
        }
    }
    if (compare.length == 3) count++
    println(count)
}