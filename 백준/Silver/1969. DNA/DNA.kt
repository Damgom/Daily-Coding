fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val s = arrayOfNulls<String>(N)
    for (i in 0..<N) {
        s[i] = readln()
    }
    var sum = 0
    var result = ""
    for (i in 0..<M) {
        var max = (-1e9).toInt()
        var maxIndex = 0
        val arr = IntArray(4)
        for (j in 0..<N) {
            if (s[j]!![i] == 'A') arr[0]++
            else if (s[j]!![i] == 'C') arr[1]++
            else if (s[j]!![i] == 'G') arr[2]++
            else arr[3]++
        }
        for (j in 0..3) {
            if (arr[j] > max) {
                max = arr[j]
                maxIndex = j
            }
        }
        when (maxIndex) {
            0 -> result += "A"
            1 -> result += "C"
            2 -> result += "G"
            3 -> result += 'T'
        }
        for (j in 0..3) {
            if (j != maxIndex) {
                sum += arr[j]
            }
        }
    }
    println(result)
    println(sum)
}
