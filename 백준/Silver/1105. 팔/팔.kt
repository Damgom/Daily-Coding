fun main() {
    val (left, right) = readln().split(" ")
    var count = 0
    if (left.length == right.length) {
        for (i in left.indices) {
            if (left[i] != right[i]) {
                break
            } else if (left[i].code - '0'.code == 8) {
                count++
            }
        }
    }
    println(count)
}
