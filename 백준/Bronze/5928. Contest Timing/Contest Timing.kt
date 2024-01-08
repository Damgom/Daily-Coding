fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val d = input[0]
    val h = input[1]
    val m = input[2]

    val startingDate = 11
    val startingHour = 11
    val startingMinute = 11

    val endingTimeInMinutes = (d - startingDate) * 24 * 60 + (h - startingHour) * 60 + (m - startingMinute)

    if (endingTimeInMinutes < 0) {
        println("-1")
    } else {
        println(endingTimeInMinutes)
    }
}