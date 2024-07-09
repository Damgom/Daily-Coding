import java.util.*

fun main() {
    val n = readln().toInt()
    var endTime = 0
    val cowArr = Array(n) { IntArray(2) }

    for (i in 0..<n){
        val input = readln().split(" ").map { it.toInt() }
        cowArr[i][0] = input[0]
        cowArr[i][1] = input[1]
    }

    Arrays.sort(cowArr) { o1: IntArray, o2: IntArray ->
        o1[0] - o2[0]
    }

    for (i in 0..<n) {
        if (endTime < cowArr[i][0]) {
            endTime = cowArr[i][0] + cowArr[i][1]
        } else endTime += cowArr[i][1]
    }
    println(endTime)
}
