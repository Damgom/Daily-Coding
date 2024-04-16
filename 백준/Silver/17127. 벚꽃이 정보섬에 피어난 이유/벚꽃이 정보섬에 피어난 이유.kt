fun main() {
    val n = readln().toInt()
    val trees = readln().split(" ").map { it.toInt() }
    val check = BooleanArray(n)
    var maxValue = 0
    for (i in 0..<4) {
        var data = 1
        for (j in i..<n - 3 + i) {
            data *= trees[j]
            check[j] = true
        }
        for (k in 0..<n) {
            if (!check[k]) {
                data += trees[k]
            }
        }
        if (data > maxValue) {
            maxValue = data
        }
        repeat(n) {
            if (check[it]) {
                check[it] = false
            }
        }
    }
    println(maxValue)
}
