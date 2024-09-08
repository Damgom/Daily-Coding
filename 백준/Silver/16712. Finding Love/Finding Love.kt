import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val m = scanner.nextInt()
    val list = mutableListOf<Int>()
    repeat(n) {
        list.add(scanner.nextInt())
    }
    repeat(n - m + 1) {
        val v = scanner.nextInt()
        list.subList(0, m).sort()
        list.removeAt(v - 1)
    }
    list.sort()
    println(list.joinToString(" "))
}