data class Miniature(val quality: Int, val price: Int)

fun main() {
    val n = readln().toInt()
    val miniatures = mutableListOf<Miniature>()

    repeat(n) {
        val (quality, price) = readln().split(" ").map { it.toInt() }
        miniatures.add(Miniature(quality, price))
    }

    val method1 = selectByQuality(miniatures)
    println("${method1[0].quality} ${method1[0].price} ${method1[1].quality} ${method1[1].price}")

    val method2 = selectByPrice(miniatures)
    println("${method2[0].quality} ${method2[0].price} ${method2[1].quality} ${method2[1].price}")
}

fun selectByQuality(miniatures: List<Miniature>): List<Miniature> {
    val sorted = miniatures.sortedWith(compareByDescending<Miniature> { it.quality }.thenBy { it.price })
    return listOf(sorted[0], sorted[1])
}

fun selectByPrice(miniatures: List<Miniature>): List<Miniature> {
    val sorted = miniatures.sortedWith(compareBy<Miniature> { it.price }.thenByDescending { it.quality })
    return listOf(sorted[0], sorted[1])
}