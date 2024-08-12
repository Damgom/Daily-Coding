import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val t = scanner.nextInt()

    repeat(t) {
        val k = scanner.nextInt()
        val x = scanner.nextLong()

        if (makeFibonacci(k, x)) {
            println("YES")
        } else {
            println("NO")
        }
    }
}

fun makeFibonacci(k: Int, x: Long): Boolean {
    val fib = generateFibonacci(x)

    when (k) {
        1 -> return x in fib
        2 -> {
            for (f in fib) {
                if (fib.contains(x - f)) return true
            }
        }
        3 -> {
            for (f1 in fib) {
                for (f2 in fib) {
                    val f3 = x - f1 - f2
                    if (f3 > 0 && fib.contains(f3)) return true
                }
            }
        }
    }

    return false
}

fun generateFibonacci(limit: Long): Set<Long> {
    val fib = mutableSetOf(1L, 1L)
    var a = 1L
    var b = 1L

    while (b <= limit) {
        val c = a + b
        if (c > limit) break
        fib.add(c)
        a = b
        b = c
    }

    return fib
}