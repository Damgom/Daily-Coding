fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val j = readln().toInt()
    var answer = 0
    var start = 1
    var end = m
    for (i in 0..<j) {
        val apple = readln().toInt()
        if (start > apple) {
            answer += start - apple
            end -= start - apple
            start = apple
        } else if (end < apple) {
            answer += apple - end
            start += apple - end
            end = apple
        }
    }
    println(answer)
}