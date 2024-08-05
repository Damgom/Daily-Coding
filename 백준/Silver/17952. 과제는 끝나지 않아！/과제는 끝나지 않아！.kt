import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val subjectQueue = ArrayDeque<Pair<Int, Int>>()
    var result = 0

    repeat(br.readLine().toInt()) {
        val input = br.readLine().split(" ")
        if (input[0] == "1") {
            subjectQueue.addLast(input[1].toInt() to input[2].toInt())
        }

        if (subjectQueue.isNotEmpty()) {
            val (score, min) = subjectQueue.last()
            if (min == 1) {
                result += score
                subjectQueue.removeLast()
            } else if (min > 1) {
                subjectQueue.removeLast()
                subjectQueue.addLast(score to min - 1)
            }
        }
    }

    bw.write(result.toString())
    bw.flush()
    bw.close()
    br.close()
}