fun main() {
    val N = readln().toInt()
    val arr = readln().split(" ").map { it.toInt() }
    val arr2 = readln().split(" ").map { it.toInt() }
    val sortedArr = arr.sorted()
    val sortedArr2 = arr2.sorted()
    var result = 0
    for (i in arr.indices) {
        result += sortedArr[i] * sortedArr2[sortedArr.size - 1 - i]
    }
    println(result)
}
