fun main() {
    val n = readln().toInt()
    val arr = mutableListOf<Int>()
    repeat(n) {
        arr.add(readln().toInt())
    }
    arr.sortDescending()
    var sum = 0L
    for (i in arr.indices) {
        if (arr[i] - i <= 0) {
            break;
        }
        sum += arr[i] - i
    }
    println(sum)
}