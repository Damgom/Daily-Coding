import kotlin.math.pow

fun main() {
    val (a, b) = readln().split(" ")
    val numbers = mutableMapOf<Char, Int>()
    var count = 0
    val answer = intArrayOf(0, 0)

    for (i in 0..9) {
        numbers[i.toString()[0]] = i
    }
    for (i in 0..25) {
        numbers[(97 + i).toChar()] = i + 10
    }

    val aMax = a.maxOrNull()!!
    val bMax = b.maxOrNull()!!

    fun transNotation(string: String, notation: Int): Long {
        var temp = 0L
        for (i in string.indices) {
            temp += (notation.toLong().pow(i) * numbers[string[string.length - 1 - i]]!!)
        }
        return temp
    }

    for (i in numbers[aMax]!! + 1..36) {
        for (j in numbers[bMax]!! + 1..36) {
            if (i == j) continue
            if (transNotation(a, i) == transNotation(b, j)) {
                if (transNotation(a, i) >= 2L.pow(63)) continue
                answer[0] = i
                answer[1] = j
                count++
            }
        }
    }

    when {
        count == 0 -> println("Impossible")
        count > 1 -> println("Multiple")
        count == 1 -> println("${transNotation(a, answer[0])} ${answer[0]} ${answer[1]}")
    }
}

fun Long.pow(n: Int): Long = this.toDouble().pow(n).toLong()
fun Int.pow(n: Int): Int = this.toDouble().pow(n).toInt()