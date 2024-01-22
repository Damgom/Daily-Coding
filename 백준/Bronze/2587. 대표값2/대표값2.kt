import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = IntArray(5)
    for (i in 0..< 5) {
        arr[i] = readLine()!!.toInt()
    }
    arr.sort()
    val middleIndex = arr.size / 2
    println(arr.average().toInt())
    println(arr[middleIndex])
}
