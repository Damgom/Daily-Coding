import java.math.BigInteger

fun main() {
    val n = BigInteger(readln())
    var start = BigInteger.ONE
    var end = n
    var mid: BigInteger
    while (true) {
        mid = start.add(end)
        mid = mid.divide(BigInteger.valueOf(2))
        val result = mid.multiply(mid).compareTo(n)
        if (result == 0) {
            break
        } else if (result > 0) {
            end = mid.subtract(BigInteger.ONE)
        } else start = mid.add(BigInteger.ONE)
    }
    println(mid)
}

