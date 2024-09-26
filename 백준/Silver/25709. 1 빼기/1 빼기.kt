fun main() {
    var n = readln().toInt()
    var ans = 0
    while (n > 0) {
        var str = n.toString()
        var hasOne = false
        if ('1' in str) {
            str = str.replaceFirst("1", "")
            n = if (str.isEmpty()) {
                0
            } else {
                str.toInt()
            }
            hasOne = true
        }
        if (hasOne) {
            ans++
            continue
        }
        n--
        ans++
    }

    println(ans)
}
