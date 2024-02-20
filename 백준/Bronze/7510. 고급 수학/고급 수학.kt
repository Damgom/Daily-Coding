fun main() {
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
        println("Scenario #$i:")
        if (isRightTriangle(a, b, c)) {
            println("yes")
        } else {
            println("no")
        }
        println()
    }
}

fun isRightTriangle(a: Int, b: Int, c: Int): Boolean {
    val sortedSides = listOf(a, b, c).sorted()
    return sortedSides[0] * sortedSides[0] + sortedSides[1] * sortedSides[1] == sortedSides[2] * sortedSides[2]
}
