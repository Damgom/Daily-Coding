fun main() {
    val testcase = readln().toInt()
    repeat(testcase) {
        val k = readln().toInt()
        var flag = false
        for (i in 1..k) {
            for (j in 1..k) {
                val sum = i * (i + 1) / 2 + j * (j + 1) / 2
                if (isTriangularNumber(k - sum)) {
                    flag = true
                    break
                }
            }
            if (flag) break
        }
        println(if (flag) 1 else 0)
    }
}

fun isTriangularNumber(num: Int): Boolean {
    var n = 1
    var triangular = 0
    while (triangular < num) {
        triangular = n * (n + 1) / 2
        if (triangular == num) return true
        n++
    }
    return false
}


