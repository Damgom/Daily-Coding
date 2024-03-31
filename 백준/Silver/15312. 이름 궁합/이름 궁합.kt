fun main() {
    val A = readln()
    val B = readln()
    val charVal = intArrayOf(3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)
    val arr = IntArray(A.length + B.length)
    for (i in arr.indices step 2) {
        arr[i] = charVal[A[i / 2] - 'A']
        arr[i + 1] = charVal[B[i / 2] - 'A']
    }
    var size = arr.size
    while (size > 2) {
        for (i in 0..<size - 1) {
            arr[i] = (arr[i] + arr[i + 1]) % 10
        }
        arr[--size] = 0
    }
    val result = arr.take(2).joinToString("").padStart(2, '0')
    println(result)
}
