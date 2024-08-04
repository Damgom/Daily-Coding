import java.util.*

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()
    readln().split(" ").map { queue.add(it.toInt()) }
    val temp: Deque<Int> = LinkedList()
    var count = 0
    var num: Int
    while (true) {
        count++
        while (temp.size < k) {
            if (queue.isEmpty()) {
                break
            }
            num = queue.poll()

            if (num == 1) {
                temp.addFirst(num)
            } else {
                temp.addLast(num)
            }
        }

        if (temp.peekFirst() == temp.peekLast()) {
            temp.pollFirst()
        } else {
            temp.pollFirst()
            temp.pollLast()
        }

        if (temp.isEmpty() && queue.isEmpty()) {
            break
        }
    }
    println(count)
}