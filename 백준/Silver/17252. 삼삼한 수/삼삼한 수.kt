fun main() {
    var N = readln().toLong()

    if (N == 0L) {
        println("NO")
        return
    }

    while (N != 0L) {
        if (N % 3 > 1) {
            println("NO")
            return
        }
        N /= 3
    }

    println("YES")
}