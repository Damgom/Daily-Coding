fun main() {
    val (n, s, r) = readln().split(" ").map { it.toInt() }
    val team = IntArray(n){ 1 }
    readln().split(" ").map { team[it.toInt() - 1]-- }
    readln().split(" ").map { team[it.toInt() - 1]++ }
    for (i in 0..<n - 1) {
        if (team[i] == 0 && team[i + 1] == 2) {
            team[i]++;
            team[i + 1]--;
        } else if (team[i + 1] == 0 && team[i] == 2) {
            team[i + 1]++;
            team[i]--;
        }
    }
    var result = 0
    for (kayak in team) {
        if (kayak == 0) {
            result++
        }
    }
    println(result)
}
