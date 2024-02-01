fun main() {
    val br = System.`in`.bufferedReader()
    var result = ""
    br.readLine()!!.split("-").map { result += it[0] }
    println(result)
}
