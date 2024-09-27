import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) break
        val list = mutableListOf<Pair<String, String>>()
        repeat(n) {
            val temp = br.readLine()
            list.add(Pair(temp.lowercase(Locale.getDefault()), temp))
        }
        list.sortBy { it.first }
        sb.append(list[0].second).append("\n")
    }
    print(sb)
}
