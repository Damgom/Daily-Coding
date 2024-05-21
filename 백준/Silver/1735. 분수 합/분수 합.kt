fun main() {
    val (numerator, denominator) = readln().split(" ").map { it.toInt() }
    val (numerator2, denominator2) = readln().split(" ").map { it.toInt() }
    var sumNumerator = denominator2 * numerator + denominator * numerator2
    var sumDenominator = denominator * denominator2
    val gcd = gcd(sumNumerator, sumDenominator)
    sumDenominator /= gcd
    sumNumerator /= gcd
    println("$sumNumerator $sumDenominator")
}

fun gcd(a: Int, b: Int): Int {
    var a = a
    var b = b
    if (a <= b) {
        val temp = a
        a = b
        b = temp
    }
    if (b == 0) {
        return a
    }
    return gcd(b, a % b)
}

fun lcm(x: Int, y: Int): Int {
    return (x * y) / gcd(x, y)
}
