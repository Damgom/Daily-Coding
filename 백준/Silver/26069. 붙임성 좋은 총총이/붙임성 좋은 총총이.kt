fun main() {
    val enter: HashSet<Any?> = HashSet<Any?>()
    enter.add("ChongChong")
    val N = readln().toInt()
    for (i in 0..<N) {
        val (A, B) = readln().split(" ")
        if (enter.contains(A) || enter.contains(B)) {
            enter.add(A)
            enter.add(B)
        }
    }
    println(enter.size.toString())
}
