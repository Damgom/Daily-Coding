import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
   val br = BufferedReader(InputStreamReader(System.`in`))
   val st = StringTokenizer(br.readLine())
   val sum = (st.nextToken().toInt() + st.nextToken().toInt())
   println(sum)
}