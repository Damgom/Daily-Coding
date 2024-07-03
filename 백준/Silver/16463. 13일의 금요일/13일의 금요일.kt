fun main() {
    val n = readln().toInt()
    val days = intArrayOf(0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    var answer = 0
    var date = 13
    for (year in 2019..n) {
        for (month in 1..12) {
            if (date % 7 == 4) answer++
            date += days[month]
            if (month == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) date++
        }
    }
    println(answer)
}