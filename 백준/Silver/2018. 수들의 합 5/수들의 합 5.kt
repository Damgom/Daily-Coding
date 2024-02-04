fun main() {
    val br = System.`in`.bufferedReader()
    val number = br.readLine()!!.toInt()
    var result = 0
    for (num in 1..number) {
        var sum = 0
        var temp = num
        while (sum < number) {
            sum += temp
            temp++
            if (sum == number) {
                result++
                break
            }
        }
    }
    println(result)
}
