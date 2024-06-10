fun main() {
    readln()
    val s = readln()
    var cnt = 0
    var cntL = 0
    var cntS = 0
    var chk = true
    var i = 0
    while (chk && i < s.length) {
        chk = true
        when (s[i]) {
            'L' -> cntL++
            'S' -> cntS++
            'R' -> if (cntL == 0) chk = false else {
                cnt++
                cntL--
            }

            'K' -> if (cntS == 0) chk = false else {
                cnt++
                cntS--
            }

            else -> cnt++
        }
        i++
    }
    println(cnt)
}