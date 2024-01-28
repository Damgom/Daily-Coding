import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine()!!.lowercase(Locale.getDefault())
    val charCountMap = mutableMapOf<Char, Int>()
    for (char in input) {
        if (char.isLetter()) {
            charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
        }
    }
    val maxCount = charCountMap.values.maxOrNull()
    val mostFrequentChars = charCountMap.filterValues { it == maxCount }.keys
    val result = if (mostFrequentChars.size == 1) {
        mostFrequentChars.first().uppercaseChar()
    } else {
        "?"
    }
    println(result)
}
