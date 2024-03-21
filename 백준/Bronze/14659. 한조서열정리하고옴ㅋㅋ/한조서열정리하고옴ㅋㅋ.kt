fun main() {
    val n = readln()
    val peaks = readln().split(" ").map { it.toInt() }
    var max = 0
    for (i in peaks.indices) {
        var temp = 0
        for (j in i + 1..<peaks.size) {
            if (peaks[i] > peaks[j]) {
                temp++
            } else break
        }
        if (temp > max) {
            max = temp
        }
    }
    println(max)
}