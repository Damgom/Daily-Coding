fun main() {
    val X = readln()
    var simple = X
    var count = 0
    while (simple.length != 1) {
        count++
        var temp = 0
        for (i in simple.indices) {
            temp += simple[i].toString().toInt()
        }
        simple = temp.toString()
    }
    if (simple.toInt() % 3 == 0) {
        println(count)
        println("YES")
    } else {
        println(count)
        println("NO")
    }
}
