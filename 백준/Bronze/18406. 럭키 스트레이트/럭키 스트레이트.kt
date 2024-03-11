fun main() {
    val n = readln()
    val midIndex = (n.length / 2) - 1
    var left = 0
    var right = 0
    for (i in n.indices) {
        val digit = n[i].toString().toInt()
        if (i > midIndex) {
            right += digit
        } else {
            left += digit
        }
    }
    if (right == left) {
        println("LUCKY")
    } else println("READY")
}
