import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val xPrice = br.readLine()!!.toInt()
    val yStandard = br.readLine()!!.toInt()
    val yLimit = br.readLine()!!.toInt()
    val yPrice = br.readLine()!!.toInt()
    val amount = br.readLine()!!.toInt()
    val xResult = amount * xPrice
    val yResult: Int = if (amount <= yLimit) {
        yStandard
    } else {
        yStandard + ((amount - yLimit) * yPrice)
    }
    println(xResult.coerceAtMost(yResult))
}
