fun main() {
    val woolim = readln().split(" ").map { it.toInt() }
    val startLink = readln().split(" ").map { it.toInt() }
    var score = 0
    for (i in woolim.indices) {
        score += woolim[i]
        if (score > 0) {
            println("Yes")
            return
        }
        score -= startLink[i]
    }
    println("No")
}
