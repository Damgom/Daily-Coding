fun main() {
    val (s1, s2) = readln().split(" ").map { it.toDouble() }
    println(if ((s1 >= s2 / 2)) "E" else "H")
}
