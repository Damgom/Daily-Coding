import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = IntArray(n)
    for (i in 0..<n) {
        arr[i] = br.readLine().toInt()
    }
    val answer = IntArray(n)
    var sum = 0
    for (i in arr.indices) {
        if (i % 2 != 0) {
            sum -= arr[i]
        } else {
            sum += arr[i]
        }
    }
    answer[0] = sum / 2
    for (i in 1..<arr.size) {
        answer[i] = arr[i - 1] - answer[i - 1]
    }
    for (i in answer.indices) {
        println(answer[i])
    }
}
