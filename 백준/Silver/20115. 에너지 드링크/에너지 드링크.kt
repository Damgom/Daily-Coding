fun main() {
    val n = readln()
    val drink = readln().split(" ").map { it.toDouble() }
    var result = 0.0
    var curDrink = drink[0]
    for (i in 1..<drink.size) {
        if (drink[i] > curDrink) {
            result += curDrink / 2
            curDrink = drink[i]
        } else result += drink[i] / 2
    }
    println(result + curDrink)
}
