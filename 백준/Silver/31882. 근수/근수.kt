import java.math.BigInteger
import java.util.*

fun main() {
    readln()
    val st = StringTokenizer(readln(), "134567890")

    val score = Array(1000001) { BigInteger.ZERO }
    score[1] = BigInteger.ONE
    score[2] = BigInteger.valueOf(4)

    for (i in 3..<1000001) {
        score[i] = score[i - 2] + BigInteger.valueOf(i.toLong()) * BigInteger.valueOf(i.toLong())
    }

    var count = BigInteger.ZERO
    while (st.hasMoreElements()) {
        count += score[st.nextToken().length]
    }

    println(count)
}