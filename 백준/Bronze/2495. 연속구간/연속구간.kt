fun main() {
    repeat(3) {
        val num = readln()
        val longestConsecutive = findLongestConsecutive(num)
        println(longestConsecutive)
    }
}

fun findLongestConsecutive(num: String): Int {
    var maxConsecutive = 1
    var currentConsecutive = 1

    for (i in 1..<num.length) {
        if (num[i] == num[i - 1]) {
            currentConsecutive++
            if (currentConsecutive > maxConsecutive) {
                maxConsecutive = currentConsecutive
            }
        } else {
            currentConsecutive = 1
        }
    }

    return maxConsecutive
}
