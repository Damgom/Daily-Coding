fun main() {
    while (true) {
        val str = readln()
        if (str == "end") break
        val validation = passwordValid(str)
        println(if (validation) "<$str> is acceptable." else "<$str> is not acceptable.")
    }
}

fun passwordValid(str: String): Boolean {
    val vowel = arrayOf('a', 'e', 'i', 'o', 'u')
    var consonantCount = 0
    var vowelCount = 0
    var containsVowel = false
    var preChar = ' '
    for (char in str) {
        if (consonantCount == 3 || vowelCount == 3) {
            return false
        }
        if (preChar == char && preChar != 'e' && preChar != 'o') {
            return false
        }
        if (vowel.contains(char)) {
            containsVowel = true
            consonantCount = 0
            vowelCount++
        } else {
            vowelCount = 0
            consonantCount++
        }
        preChar = char
    }
    if (containsVowel && consonantCount < 3 && vowelCount < 3) {
        return true
    } else return false
}