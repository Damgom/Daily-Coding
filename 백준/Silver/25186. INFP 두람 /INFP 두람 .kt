fun main() {
    val N = readln().toInt()
    val d = readln().split(" ").map { it.toLong() }
    val sum = d.sum()

    if (N == 1 && d[0] == 1L) {
        println("Happy")
        return
    }

    var flag = true
    for (i in 0 until N) {
        if (sum - d[i] < d[i]) {
            flag = false
            break
        }
    }

    println(if (flag) "Happy" else "Unhappy")
}
