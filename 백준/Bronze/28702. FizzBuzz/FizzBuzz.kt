import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var count = 0
    var depth = 0
    for (i in 1..3) {
        val a = br.readLine()
        if (!isString(a)) {
            count = a.toInt()
            depth = i
        }
    }
    count = when (depth) {
        1 -> count + 3
        2 -> count + 2
        3 -> count + 1
        else -> 0
    }
    if (count % 3 == 0) {
        if (count % 5 == 0) {
            println("FizzBuzz")
        } else {
            println("Fizz")
        }
    } else {
        if (count % 5 == 0) {
            println("Buzz")
        } else {
            println(count)
        }
    }
}

fun isString(str: String): Boolean {
    val ex = str.uppercase(Locale.getDefault())
    for (i in ex.indices) {
        val temp = str[i].code - 'A'.code
        if (temp in 0..25) {
            return true
        }
    }
    return false
}
