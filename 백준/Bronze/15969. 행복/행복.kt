fun main() {
    readln().toInt()
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    readln().split(" ").map {
        if (it.toInt() < min) {
            min = it.toInt()
        } else if (it.toInt() > max) {
            max = it.toInt()
    }}
    println(max - min)
}
