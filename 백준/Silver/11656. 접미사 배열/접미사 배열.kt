fun main() {
    val s = readln()
    val list = mutableListOf<String>()
    for (i in s.indices) {
        list.add(s.substring(i))
    }
    list.sort()
    for (i in list.indices) {
        println(list[i])
    }
}
