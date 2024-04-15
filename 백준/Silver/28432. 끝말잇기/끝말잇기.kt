fun main() {
    val n = readln().toInt()

    val set = HashSet<String>()
    var before = '0'
    var after = '0'
    var flagBefore = false
    var flagAfter = false

    repeat(n) {
        val str = readln()
        if (str != "?") {
            set.add(str)
            if (flagBefore && !flagAfter) {
                after = str[0]
                flagAfter = true
            }
        } else {
            flagBefore = true
        }
        if (!flagBefore)
            before = str.last()
    }

    var result = ""

    val m = readln().toInt()
    if (n == 1) {
        println(readln())
    } else {
        repeat(m) {
            val str = readln()
            if ((str[0] == before || before == '0') &&
                (str.last() == after || after == '0') && !set.contains(str)
            ) {
                result = str
            }
        }
        println(result)
    }
}
