fun main() {
    var N = readln().toLong()
    val arr = LongArray(21)
    if (N == 0L) {
        println("NO")
        return
    }
    arr[0] = 1L
    for (i in 1..20) {
        arr[i] = arr[i - 1] * i
    }
    for (i in 20 downTo 0) {
        if (N >= arr[i]) {
            N -= arr[i]
        }
    }
    if (N == 0L) {
        println("YES")
    } else {
        println("NO")
    }
}
