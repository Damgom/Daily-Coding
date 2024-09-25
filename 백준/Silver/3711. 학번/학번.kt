import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val t = br.readLine().toInt()
    val sb = StringBuilder()

    repeat(t) {
        val n = br.readLine().toInt()
        val arr = IntArray(n) { br.readLine().toInt() }
        var k = 1
        val checkArr = IntArray(1000000)

        while (true) {
            var flag = true
            for (i in 0..<n) {
                if (checkArr[arr[i] % k] == k) {
                    flag = false
                    break
                }
                checkArr[arr[i] % k] = k
            }
            if (flag) {
                sb.append(k).append('\n')
                break
            }
            k++
        }
    }
    print(sb)
}
