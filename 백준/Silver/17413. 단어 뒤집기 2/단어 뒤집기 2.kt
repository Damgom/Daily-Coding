import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val s = br.readLine()

    val result = Stack<Char>()
    val sb = StringBuilder()
    var flag = false

    for (i in s.indices) {
        when {
            s[i] == '<' -> {
                while (result.isNotEmpty()) {
                    sb.append(result.pop())
                }
                sb.append(s[i])
                flag = true
            }
            s[i] == '>' -> {
                flag = false
                sb.append(s[i])
            }
            s[i] == ' ' -> {
                while (result.isNotEmpty()) {
                    sb.append(result.pop())
                }
                sb.append(s[i])
            }
            else -> {
                if (!flag) {
                    result.push(s[i])
                } else {
                    sb.append(s[i])
                }
                if (s[i] == ' ') {
                    sb.append(s[i])
                }
            }
        }
    }
    while (result.isNotEmpty()) {
        sb.append(result.pop())
    }
    println(sb)
}
