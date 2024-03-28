fun main() {
    val (n, m) = readln().split(":").map { it.toInt() }
    val gcd = gcd(n, m)
    print("${n / gcd}:${m / gcd}")
}

fun gcd(n1: Int, n2: Int): Int {
    return if (n2 == 0) {
        n1
    } else {
        gcd(n2, n1 % n2)
    }
}
