fun main() {
    val n = readLine()!!.toInt()
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0
    var axis = 0
    repeat(n) {
        val (x, y) = readLine()!!.split(" ").map(String::toInt)
        when {
            x == 0 || y == 0 -> axis++
            x > 0 && y > 0 -> q1++
            x < 0 && y > 0 -> q2++
            x < 0 && y < 0 -> q3++
            else -> q4++
        }
    }
    println("Q1: $q1")
    println("Q2: $q2")
    println("Q3: $q3")
    println("Q4: $q4")
    println("AXIS: $axis")
}
