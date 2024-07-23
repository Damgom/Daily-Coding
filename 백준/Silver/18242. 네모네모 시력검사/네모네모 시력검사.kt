import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()
    val M = scanner.nextInt()
    scanner.nextLine() // To consume the remaining newline

    val arr = Array(N) { scanner.nextLine().toCharArray() }

    var leftUp: Pair<Int, Int>? = null
    var rightDown: Pair<Int, Int>? = null

    outer@ for (i in 0 until N) {
        for (j in 0 until M) {
            if (arr[i][j] == '#') {
                leftUp = Pair(i, j)
                break@outer
            }
        }
    }

    outer@ for (i in N - 1 downTo 0) {
        for (j in M - 1 downTo 0) {
            if (arr[i][j] == '#') {
                rightDown = Pair(i, j)
                break@outer
            }
        }
    }

    if (leftUp != null && rightDown != null) {
        val mid = Pair((leftUp.first + rightDown.first) / 2, (leftUp.second + rightDown.second) / 2)

        when {
            arr[leftUp.first][mid.second] == '.' -> println("UP")
            arr[mid.first][leftUp.second] == '.' -> println("LEFT")
            arr[mid.first][rightDown.second] == '.' -> println("RIGHT")
            arr[rightDown.first][mid.second] == '.' -> println("DOWN")
        }
    }
}
