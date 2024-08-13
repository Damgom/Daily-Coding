import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    var result = 0
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    result = when {
        n == 1 -> {
            1
        }
        n == 2 -> {
            min(4.0, ((m + 1) / 2).toDouble()).toInt()
        }
        m < 7 -> {
            min(4.0, m.toDouble()).toInt()
        }
        else -> {
            m - 7 + 5
        }
    }
    println(result)
}
