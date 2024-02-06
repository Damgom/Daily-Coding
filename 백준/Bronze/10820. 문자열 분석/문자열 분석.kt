fun main() {
    val br = System.`in`.bufferedReader()
    while (true) {
        val input = br.readLine() ?: break
        var lowercase = 0
        var uppercase = 0
        var num = 0
        var blank = 0
        for (char in input) {
            when {
                char.isUpperCase() -> uppercase++
                char.isLowerCase() -> lowercase++
                char.isDigit() -> num++
                char.isWhitespace() -> blank++
            }
        }
        println("$lowercase $uppercase $num $blank")
    }
}
