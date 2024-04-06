fun main() {
    val n = readln().toInt()
    val names = mutableListOf<String>()

    repeat(n) {
        names.add(readln())
    }

    when (isIncreasing(names)) {
        true -> println("INCREASING")
        false -> when (isDecreasing(names)) {
            true -> println("DECREASING")
            false -> println("NEITHER")
        }
    }
}

fun isIncreasing(names: MutableList<String>): Boolean {
    for (i in 0..<names.size - 1) {
        if (names[i] >= names[i + 1]) {
            return false
        }
    }
    return true
}

fun isDecreasing(names: MutableList<String>): Boolean {
    for (i in 0..<names.size - 1) {
        if (names[i] <= names[i + 1]) {
            return false
        }
    }
    return true
}