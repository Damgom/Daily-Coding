import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val sb = StringBuilder()
    for (tc in 1..t) {
        val n = br.readLine().toInt()
        val set = HashSet<Int>()
        var cur = n
        var i = 1
        while (i <= 100) {
            var temp = cur
            while (temp != 0) {
                set.add(temp % 10)
                temp /= 10
            }
            if (set.size == 10) break
            i++
            cur += n
        }
        sb.append(String.format("Case #%d: ", tc)).append(if (set.size != 10) "INSOMNIA" else cur).append('\n')
    }
    print(sb)
}
