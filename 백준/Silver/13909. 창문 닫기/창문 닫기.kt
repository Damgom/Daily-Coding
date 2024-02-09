fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    var count = 0
    var i = 1
    while (i * i <= n) {
        count++
        i++
    }
    println(count)
}