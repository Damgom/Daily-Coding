import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val recruit = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    val cur = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    val total = ((cur[0] - recruit[0]) * 360) + ((cur[1] - recruit[1]) * 30) + (cur[2] - recruit[2])

    val year = total / 360
    var annual = 0
    for (i in 1..year) {
        var temp = i
        if (temp % 2 == 0) temp--
        val a = temp - (temp / 2 + 1)
        annual += a + 15
    }

    var monthly = total / 30
    if (monthly > 36) monthly = 36

    println("$annual $monthly")
    println("${total}days")
}