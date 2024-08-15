import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val T = br.readLine().toInt()
    repeat(T) {
        val n = br.readLine().toInt()
        val list = mutableListOf<String>()
        repeat(n) {
            list.add(br.readLine())
        }
        list.sortWith(CustomComparator())
        list.forEach { println(it) }
    }
}

class CustomComparator : Comparator<String> {
    override fun compare(s1: String, s2: String): Int {
        if (s1 == s2) return 0
        if (s1.startsWith(s2)) return 1
        if (s2.startsWith(s1)) return -1

        for (i in 0 until minOf(s1.length, s2.length)) {
            val c1 = s1[i]
            val c2 = s2[i]

            if (c1 != c2) {
                if (c1 == '-') return 1
                if (c2 == '-') return -1
                val lowerC1 = c1.lowercaseChar()
                val lowerC2 = c2.lowercaseChar()

                return when {
                    lowerC1 != lowerC2 -> {
                        lowerC1.compareTo(lowerC2)
                    }

                    else -> {
                        c1.compareTo(c2)
                    }
                }
            }
        }
        return s1.length.compareTo(s2.length)
    }
}