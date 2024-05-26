fun main() {
    val n = readln().toInt()
    val arr = IntArray(n)
    val input = readln().split(" ").map { it.toInt() }
    for (i in 0..<n) {
        arr[i] = input[i]
    }
    val list = mutableListOf<String>()
    for (i in arr.indices.reversed()) {
        list.add(arr[i], (i + 1).toString())
    }
    val sb = StringBuilder()
    for (i in list.indices) {
        sb.append(list[i]).append(" ")
    }
    println(sb)
}
