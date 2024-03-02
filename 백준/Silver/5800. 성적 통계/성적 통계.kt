fun main() {
    val K = readln().toInt()
    var classNum = 1
    val sb = StringBuilder()
    repeat(K) {
        val input = readln().split(" ").map { it.toInt() }
        val n = input[0]
        val scores = input.subList(1, input.size).toIntArray().sorted()
        val score = getScore(scores)
        sb.append("Class $classNum").append("\n")
        sb.append("Max ${score[0]}, Min ${score[1]}, Largest gap ${score[2]}").append("\n")
        classNum++
    }
    println(sb)
}

fun getScore(arr: List<Int>): IntArray {
    val temp = IntArray(3)
    temp[0] = arr.maxOrNull()!!
    temp[1] = arr.minOrNull()!!
    temp[2] = arr[1] - arr[0]
    for (i in 0..< arr.size - 1) {
        val gap = arr[i + 1] - arr[i]
        if (gap > temp[2]) {
            temp[2] = gap
        }
    }
    return temp
}


