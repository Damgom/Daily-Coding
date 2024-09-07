import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val (doughPrice, toppingPrice) = br.readLine().split(" ").map { it.toInt() }
    var calories = br.readLine().toInt()
    var result = calories / doughPrice
    val toppingList = ArrayList<Int>()
    repeat(n) {
        toppingList.add(br.readLine().toInt())
    }
    toppingList.sortDescending()

    for (i in toppingList.indices) {
        calories += toppingList[i]
        val temp = calories / ((i + 1) * toppingPrice + doughPrice)
        if (temp < result) break
        result = temp
    }
    println(result)
}