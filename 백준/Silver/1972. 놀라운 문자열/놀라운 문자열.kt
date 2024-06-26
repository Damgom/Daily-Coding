fun main() {
    while (true) {
        val word = readln()
        if (word == "*") {
            break
        }
        var flag = true

        for (i in word.indices) {
            val list: MutableList<String> = ArrayList()
            val set: MutableSet<String> = HashSet()
            for (j in 0..<word.length - i - 1) {
                val pair = "" + word[j] + word[j + i + 1]
                list.add(pair)
                set.add(pair)
            }
            if (list.size != set.size) {
                flag = false
                break
            }
            list.clear()
            set.clear()
        }
        if (flag) {
            println("$word is surprising.")
        } else {
            println("$word is NOT surprising.")
        }
    }
}
