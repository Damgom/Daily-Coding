fun main() {
    val (e, f, c) = readln().split(" ").map { it.toInt() }
    var emptyBottle = e + f
    var carbonatedDrinks = 0
    while (emptyBottle >= c) {
        carbonatedDrinks += emptyBottle / c
        emptyBottle = emptyBottle / c + emptyBottle % c
    }
    println(carbonatedDrinks)
}
