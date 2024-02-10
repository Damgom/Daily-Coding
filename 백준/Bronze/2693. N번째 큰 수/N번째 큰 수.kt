fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine()!!.toInt()
    repeat(n) {
        val arr = br.readLine()!!.split(" ").map { it.toInt() }
        val sortedArr = arr.sorted()
        println(sortedArr[arr.size - 3])
    }
}