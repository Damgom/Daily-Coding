fun main() {
    val numbers = readln().split(" ").map { it.toInt() }.toMutableList()
    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 0..<numbers.size - 1) {
            if (numbers[i] > numbers[i + 1]) {
                val temp = numbers[i]
                numbers[i] = numbers[i + 1]
                numbers[i + 1] = temp
                println(numbers.joinToString(" "))
                sorted = false
            }
        }
    }
}