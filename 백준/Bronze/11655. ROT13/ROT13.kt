fun main() {
    val br = System.`in`.bufferedReader()
    val input = br.readLine()!!
    val sb = StringBuilder()
    for (char in input) {
        sb.append(
            when {
            char in '0'..'9' || char == ' '-> char
            char.isUpperCase() -> (((char - 'A' + 13) % 26) + 'A'.code).toChar()
            else -> (((char - 'a') + 13) % 26 + 'a'.code).toChar()
        })
    }
    println(sb)
}
