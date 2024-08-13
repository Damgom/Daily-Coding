import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = IntArray(n)
    val sortedArr = IntArray(n)
    for (i in 0..<n) {
        val a = st.nextToken().toInt()
        arr[i] = a
        sortedArr[i] = a
    }
    Arrays.sort(sortedArr)
    val map: MutableMap<Int, Int> = HashMap()
    var rank = 0
    for (i in sortedArr.indices) {
        if (!map.containsKey(sortedArr[i])) {
            map[sortedArr[i]] = rank
            rank++
        }
    }

    val sb = StringBuilder()
    for (i in 0..<arr.size - 1) {
        sb.append(map[arr[i]]).append(' ')
    }
    sb.append(map[arr[arr.size - 1]])
    println(sb)
}
