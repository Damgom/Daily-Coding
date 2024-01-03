import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
   val br = BufferedReader(InputStreamReader(System.`in`))
   val count = br.readLine()!!.toInt()
   repeat(count) {
      val st = StringTokenizer(br.readLine())
      println(st.nextToken().toLong() + st.nextToken().toLong())
   }
}