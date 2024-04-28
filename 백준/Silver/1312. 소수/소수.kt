fun main() {
    var (A, B, N) = readln().split(" ").map { it.toInt() }
    var result = 0
    for (i in 0..<N) {
        A = (A % B) * 10
        result = A / B
    }
    println(result)
}
