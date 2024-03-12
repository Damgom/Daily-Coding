fun main() {
    var count = 1
    val w = IntArray(10)
    val k = IntArray(10)
    repeat(20) {
        val score = readln().toInt()
        if (count > 10) {
            k[(count - 1) % 10] = score
        } else {
            w[count - 1] = score
        }
        count++
    }
    val sortedW = w.sorted()
    val sortedK = k.sorted()
    var wScore = 0
    var kScore = 0
    for (i in w.size - 3..<w.size) {
        wScore += sortedW[i]
        kScore += sortedK[i]
    }
    println("$wScore $kScore")
}
