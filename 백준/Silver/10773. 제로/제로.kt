import java.util.*

fun main() {
    val K = readln().toInt()
    val stack = Stack<Int>()

    for (i in 0..<K) {
        val num = readln().toInt()
        if (num == 0) {
            stack.pop()
        } else {
            stack.push(num)
        }
    }
    var sum = 0
    for (i in stack.indices) {
        sum += stack[i]
    }

    println(sum)
}
