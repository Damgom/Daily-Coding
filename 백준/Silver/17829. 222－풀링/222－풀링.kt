fun main() {
    val n = readln().toInt()
    var matrix = Array(n) { IntArray(n) }
    for (i in 0..<n) {
        matrix[i] = readln().split(" ").map { it.toInt() }.toIntArray()
    }
    while (matrix.size > 1) {
        matrix = applyPooling(matrix)
    }
    println(matrix[0][0])
}

fun applyPooling(matrix: Array<IntArray>): Array<IntArray> {
    val n = matrix.size
    val half = n / 2
    val newMatrix = Array(half) { IntArray(half) }
    for (i in 0..<half) {
        for (j in 0..<half) {
            val values = listOf(
                matrix[i * 2][j * 2],
                matrix[i * 2][j * 2 + 1],
                matrix[i * 2 + 1][j * 2],
                matrix[i * 2 + 1][j * 2 + 1]
            ).sorted()
            newMatrix[i][j] = values[2]
        }
    }
    return newMatrix
}