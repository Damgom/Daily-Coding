import java.util.*

fun main() {
    val (N, K) = readln().split(" ").map { it.toInt() }
    val arr = readln()

    val hamburgers = LinkedList<Int>()
    val people = mutableListOf<Int>()

    for (i in arr.indices) {
        when (arr[i]) {
            'H' -> hamburgers.offer(i)
            'P' -> people.add(i)
        }
    }

    var answer = 0
    for (personPos in people) {
        while (hamburgers.isNotEmpty() && hamburgers.peek() < personPos - K) {
            hamburgers.poll()
        }
        if (hamburgers.isNotEmpty() && hamburgers.peek() <= personPos + K) {
            hamburgers.poll()
            answer++
        }
    }

    println(answer)
}