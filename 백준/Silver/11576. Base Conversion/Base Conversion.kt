import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine(), " ")
    val A = st.nextToken().toInt()
    val B = st.nextToken().toInt()
    val m = br.readLine().toInt()

    val stack = Stack<Int>()
    val st2 = StringTokenizer(br.readLine(), " ")

    var sum = 0
    for (i in m - 1 downTo 0) {
        val N = st2.nextToken().toInt()
        sum += N * Math.pow(A.toDouble(), i.toDouble()).toInt()
    }
    
    while (sum != 0) {
        stack.push(sum % B)
        sum /= B
    }

    while (stack.isNotEmpty()) {
        print("${stack.pop()} ")
    }
}