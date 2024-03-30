fun main() {
    val standard = readln()
    val n = readln().toInt()
    var count = 0
    repeat(n) {
        val ring = readln()
        if (validRing(standard, ring)) {
            count++
        }
    }
    print(count)
}

fun validRing(standard: String, ring: String): Boolean {
    val n = standard.length
    val m = ring.length

    for (i in 0..<m) {
        var j = 0
        var k = i
        while (j < n && k < m) {
            if (standard[j] != ring[k]) break
            j++
            k++
        }
        k = 0
        while (j < n) {
            if (standard[j] != ring[k]) break
            j++
            k++
        }
        if (j == n) return true
    }
    return false
}
