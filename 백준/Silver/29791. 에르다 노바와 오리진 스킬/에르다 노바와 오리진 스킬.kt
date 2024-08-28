import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    br.readLine()

    val erda = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    erda.sort()

    val origin = br.readLine().split(" ").map { it.toInt() }.toMutableList()

    origin.sort()

    var useErda = 0
    var erdaCount = 0

    var useOrigin = 0
    var originCount = 0

    for (i in erda.indices) {
        val curErda = erda[i]
        if (curErda >= useErda) {
            useErda = curErda + 100
            erdaCount++
        }
    }

    for (i in origin.indices) {
        val curOrigin = origin[i]
        if (curOrigin >= useOrigin) {
            useOrigin = curOrigin + 360
            originCount++
        }
    }
    println("$erdaCount $originCount")
}