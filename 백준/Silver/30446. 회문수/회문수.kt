import kotlin.math.pow

fun main() {
    val n = readLine()!!.toLong()
    println(countPalindromes(n))
}

fun countPalindromes(n: Long): Int {
    var count = 0
    var length = 1

    while (true) {
        val start = 10.0.pow(length - 1).toLong()
        if (start > n) break

        val end = minOf(n, 10.0.pow(length).toLong() - 1)

        count += countPalindromesInRange(start, end)

        length++
    }

    return count
}

fun countPalindromesInRange(start: Long, end: Long): Int {
    var count = 0
    val length = start.toString().length
    val half = (length + 1) / 2

    val leftStart = start / 10.0.pow(length - half).toLong()
    val leftEnd = end / 10.0.pow(length - half).toLong()

    for (left in leftStart..leftEnd) {
        val palindrome = createPalindrome(left, length % 2 == 0)
        if (palindrome in start..end) {
            count++
        }
    }

    return count
}

fun createPalindrome(half: Long, isEvenLength: Boolean): Long {
    var palindrome = half
    var temp = if (isEvenLength) half else half / 10
    while (temp > 0) {
        palindrome = palindrome * 10 + temp % 10
        temp /= 10
    }
    return palindrome
}