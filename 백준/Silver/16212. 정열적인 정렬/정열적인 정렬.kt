fun main() {
    val n = readln().toInt()
    val list = readln().split(" ").map { it.toInt() }
    val sortedList = list.sorted();
    println(sortedList.joinToString(" "))
}