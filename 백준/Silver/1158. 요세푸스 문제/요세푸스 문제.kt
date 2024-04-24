import java.util.*

fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()
    for (i in 1..N) {
        queue.add(i)
    }
    val result = StringBuilder()
    result.append("<")

    while (queue.size > 1) {
        for (i in 0..<K - 1) {
            queue.offer(queue.poll())
        }
        result.append(queue.poll()).append(", ")
    }
    result.append(queue.poll()).append(">")
    println(result)
}