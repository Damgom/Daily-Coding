fun main() {
    val N = readln().toInt()
    val arr = IntArray(N)
    for (i in 0..<N) {
        arr[i] = readln().toInt()
    }
    arr.sort()

    var sum = 0.0
    for (i in arr.indices) {
        sum += arr[i].toDouble()
    }
    println(Math.round(sum / N))
    println(arr[(N - 1) / 2])
    
    var count = 0
    var max = -1
    var mode = arr[0]
    var result = false
    for (i in 0..<N - 1) {
        if (arr[i] == arr[i + 1]) {
            count++
        } else {
            count = 0
        }

        if (max < count) {
            max = count
            mode = arr[i]
            result = true
        } else if (max == count && result) {
            mode = arr[i]
            result = false
        }
    }
    println(mode)
    println(arr[N - 1] - arr[0])
}
