fun main() {
    val input = readln()
    val result = input.map { getChosung(it) }.joinToString("")
    println(result)
}

fun getChosung(char: Char): Char {
    if (char.code < 0xAC00 || char.code > 0xD7A3) {
        return char
    }

    val chosungIndex = (char.code - 0xAC00) / (21 * 28)
    return CHOSUNG[chosungIndex]
}

val CHOSUNG = arrayOf(
    'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ',
    'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
)