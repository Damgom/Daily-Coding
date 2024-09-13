import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val list = ArrayList<Int>()

    for (i in 1..n) {
        list.add(i)
    }

    while (list.size >= 2) {
        val indexesToRemove = list.indices.filter { it % 2 == 0 }.reversed()
        for (index in indexesToRemove) {
            list.removeAt(index)
        }
    }

    println(list[0])
}
