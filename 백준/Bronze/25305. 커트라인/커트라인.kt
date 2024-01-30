fun main() {
    val (N, k) = readLine()!!.split(" ").map { it.toInt() }
    val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    arr.sort()
    println(arr[arr.size - k])
}
