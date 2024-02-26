fun findSevenDwarfs(dwarfHeights: List<Int>): List<Int> {
    for (i in 0..<dwarfHeights.size - 1) {
        for (j in i + 1..<dwarfHeights.size) {
            val sumOfSeven = dwarfHeights.sum() - (dwarfHeights[i] + dwarfHeights[j])
            if (sumOfSeven == 100) {
                return dwarfHeights.filterIndexed { index, _ -> index != i && index != j }
            }
        }
    }
    return emptyList()
}

fun main() {
    val dwarfHeights = mutableListOf<Int>()
    repeat(9) {
        val height = readln().toInt()
        dwarfHeights.add(height)
    }

    val sevenDwarfs = findSevenDwarfs(dwarfHeights)
    sevenDwarfs.sorted().forEach { println(it) }
}
