fun main() {
    val word1 = readln()
    val word2 = readln()

    val frequencyMap1 = word1.groupingBy { it }.eachCount()
    val frequencyMap2 = word2.groupingBy { it }.eachCount()

    var removalCount = 0
    for ((char, count) in frequencyMap1) {
        val difference = count - (frequencyMap2[char] ?: 0)
        removalCount += if (difference > 0) difference else 0
    }
    for ((char, count) in frequencyMap2) {
        val difference = count - (frequencyMap1[char] ?: 0)
        removalCount += if (difference > 0) difference else 0
    }

    println(removalCount)
}
