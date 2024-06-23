import java.util.*

fun main() {
    val (N, K, T) = readln().split(" ").map { it.toLong() }
    val arr = readln().split(" ").map { it.toLong() }.toMutableList()

    arr.sort()

    val smaller = Stack<Long>()
    val bigger = LinkedList<Long>()
    var result = T

    for (num in arr) {
        if (num < T) {
            smaller.push(num)
        } else {
            bigger.offer(num)
        }
    }

    for (i in 0..<K.toInt()) {
        if (smaller.isEmpty()) {
            break
        } else {
            val currentTop = smaller.pop()
            result += currentTop
            while (bigger.isNotEmpty() && result > bigger.peek()) {
                val nextSize = bigger.poll()
                smaller.push(nextSize)
            }
        }
    }

    println(result)
}