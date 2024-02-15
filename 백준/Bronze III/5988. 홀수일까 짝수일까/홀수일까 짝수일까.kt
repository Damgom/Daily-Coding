fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val k = readLine()!!.toBigInteger()
        println(if (k % 2.toBigInteger() == 0.toBigInteger()) "even" else "odd")
    }
}
