fun main() {
    val n = readln().toInt()
    val cookie = Array(n) { CharArray(n) }
    var head = 0
    var arm = 0
    var waist = 0
    var lLeg = 0
    var rLeg = 0
    var headX = 0
    var headY = 0

    for (i in 0..<n) {
        cookie[i] = readln().toCharArray()
    }
    outer@ for (i in 0..<n) {
        for (j in 0..<n) {
            if (cookie[i][j] == '*') {
                head = 1
                headX = i + 1
                headY = j
                println("${headX + 1} ${headY + 1}")
                break@outer
            }
        }
    }

    for (j in 0..<n) {
        if (j == headY) {
            print("$arm ")
            arm = 0
            continue
        }
        if (cookie[headX][j] == '*') {
            arm++
        }
    }
    print("$arm ")

    for (i in headX + 1..<n) {
        if (cookie[i][headY] == '*') {
            waist++
        }
    }
    print("$waist ")

    for (i in headX + waist + 1..<n) {
        if (cookie[i][headY - 1] == '*') {
            lLeg++
        }
    }
    print("$lLeg ")

    for (i in headX + waist + 1..<n) {
        if (cookie[i][headY + 1] == '*') {
            rLeg++
        }
    }
    print("$rLeg")
}