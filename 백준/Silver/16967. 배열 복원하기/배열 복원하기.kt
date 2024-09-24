import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())
    val H = st.nextToken().toInt()
    val W = st.nextToken().toInt()
    val X = st.nextToken().toInt()
    val Y = st.nextToken().toInt()
    val BX = H + X
    val BY = W + Y
    val B = Array(BX) { IntArray(BY) }
    for (i in 0..<BX) {
        st = StringTokenizer(br.readLine())
        for (j in 0..<BY) {
            B[i][j] = st.nextToken().toInt()
        }
    }
    val A = Array(H) { IntArray(W) }
    for (i in 0..<BX) {
        for (j in 0..<BY) {
            when {
                i < X && j < W -> {
                    A[i][j] = B[i][j]
                }
                j < Y && i < H -> {
                    A[i][j] = B[i][j]
                }
                j >= Y && i >= X && j < W && i < H -> {
                    A[i][j] = B[i][j] - A[i - X][j - Y]
                }
            }
        }
    }
    for (i in 0..<H) {
        for (j in 0..<W) {
            print(A[i][j].toString() + " ")
        }
        println()
    }
}
