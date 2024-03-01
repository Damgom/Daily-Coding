fun main() {
    val list = IntArray(20) { it + 1 }
    repeat(10) {
        val (start, end) = readln().split(" ").map { it.toInt() }
        reverse(list, start - 1, end - 1)
    }
    println(list.joinToString(" "))
}

fun reverse(list: IntArray, start: Int, end: Int) {
    var i = start
    var j = end
    while (i < j) {
        val temp = list[i]
        list[i] = list[j]
        list[j] = temp
        i++
        j--
    }
}
