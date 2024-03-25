fun main() {
    while (true) {
        val str = readLine() ?: break
        val (s, t) = str.split(" ")
        var flag = false
        var sIndex = 0
        for (i in t.indices) {
            if (t[i] == s[sIndex]) {
                sIndex++
                if (sIndex == s.length) {
                    flag = true
                    break
                }
            }
        }
        if (flag) {
            println("Yes")
        } else {
            println("No")
        }
    }
}
