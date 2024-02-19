fun main() {
    val br = System.`in`.bufferedReader()
    br.readLine()!!.toInt()
    println(br.readLine()!!.split(" ").mapIndexed { index, value -> if (value.toInt() != index + 1) 1 else 0 }.sum())
}
