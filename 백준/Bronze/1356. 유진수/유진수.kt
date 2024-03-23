fun main() {
    val n = readln()
    var flag = false
    for (i in 0..<n.length - 1) {
        var front = 1
        for (j in 0..<i + 1) {
            front *= n[j] - '0'
        }
        var back = 1
        for (j in i + 1..<n.length) {
            back *= n[j] - '0'
        }
        if (front == back) {
            flag = true
            break
        }
    }
    println(if (flag) "YES" else "NO")
}