fun main() {
    val (N, M) = readln().split(" ").map { it.toInt() }
    val count = mutableSetOf<Int>()

    val sb = StringBuilder()
    repeat(N) {
        val input = readln().split(" ")
        val streak = input.take(M)
        val name = input.last()

        var maxStreak = 0
        var tmp = 0
        for (i in streak) {
            if (i == ".") {
                tmp += 1
            } else {
                tmp = 0
            }
            maxStreak = maxOf(maxStreak, tmp)
        }

        count.add(maxStreak)
        sb.append("$maxStreak $name").append("\n")
    }

    println(count.size)
    println(sb)
}