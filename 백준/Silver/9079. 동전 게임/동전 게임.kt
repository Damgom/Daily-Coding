import java.util.*

fun main() {
    val T = readln().toInt()
    repeat(T) {
        val arr = Array(3) { readln().split(" ").map { if (it == "H") '1' else '0' }.toCharArray() }
        val flatArr = arr.flatMap { it.toList() }.joinToString("")
        println(solution(flatArr))
    }
}

fun solution(arr: String): Int {
    val cases = listOf(
        listOf(0, 1, 2), listOf(3, 4, 5), listOf(6, 7, 8),
        listOf(0, 3, 6), listOf(1, 4, 7), listOf(2, 5, 8),
        listOf(0, 4, 8), listOf(2, 4, 6)
    )

    val visited = BooleanArray(512)
    val initial = arr.toInt(2)
    visited[initial] = true

    val queue: Queue<Pair<Int, Int>> = LinkedList()
    queue.add(Pair(initial, 0))

    while (queue.isNotEmpty()) {
        val (arrBin, count) = queue.poll()

        if (arrBin == 0 || arrBin == 511) {
            return count
        }

        for (numbers in cases) {
            val newArr = flip(numbers, arrBin.toString(2).padStart(9, '0').toCharArray())
            val vs = newArr.concatToString().toInt(2)
            if (!visited[vs]) {
                visited[vs] = true
                queue.add(Pair(vs, count + 1))
            }
        }
    }

    return -1
}

fun flip(numbers: List<Int>, arr: CharArray): CharArray {
    numbers.forEach { num ->
        arr[num] = if (arr[num] == '1') '0' else '1'
    }
    return arr
}
