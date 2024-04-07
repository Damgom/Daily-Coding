import java.util.*

const val MAX = 1000 + 1
var B = 0
var C = 0
var D = 0
val burger = mutableListOf<Int>()
val side = mutableListOf<Int>()
val beverage = mutableListOf<Int>()

fun discount() {
    var sum = 0
    burger.sortDescending()
    side.sortDescending()
    beverage.sortDescending()
    val setNum = minOf(burger.size, side.size, beverage.size)
    for (i in 0..<setNum) {
        sum += (burger[i] * 0.9).toInt()
        sum += (side[i] * 0.9).toInt()
        sum += (beverage[i] * 0.9).toInt()
    }
    for (i in setNum..<burger.size) {
        sum += burger[i]
    }
    for (i in setNum..<side.size) {
        sum += side[i]
    }
    for (i in setNum..<beverage.size) {
        sum += beverage[i]
    }

    println(sum)
}

fun main() {
    val scanner = Scanner(System.`in`)
    B = scanner.nextInt()
    C = scanner.nextInt()
    D = scanner.nextInt()
    var sum = 0
    for (i in 0..<B) {
        val price = scanner.nextInt()
        burger.add(price)
        sum += price
    }
    for (i in 0..<C) {
        val price = scanner.nextInt()
        side.add(price)
        sum += price
    }
    for (i in 0..<D) {
        val price = scanner.nextInt()
        beverage.add(price)
        sum += price
    }

    println(sum)
    discount()
}