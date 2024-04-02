fun main() {
    val testcase = readln().toInt()
    repeat(testcase) {
        val n = readln().toInt()
        var maxValue = 0
        var maxIndex = 0
        var sum = 0
        var same = false
        for (i in 1..n) {
            val temp = readln().toInt()
            sum += temp
            if (temp > maxValue) {
                maxValue = temp
                maxIndex = i
                same = false
            } else if (temp == maxValue) {
                same = true
            }
        }
        if (same) {
            println("no winner")
        } else {
            if (maxValue >= sum / 2 + 1) {
                println("majority winner $maxIndex")
            } else {
                println("minority winner $maxIndex")
            }
        }
    }
}
