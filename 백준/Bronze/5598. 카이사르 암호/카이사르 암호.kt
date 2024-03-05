fun decryptCaesarCipher(input: String): String {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val decryptedWord = StringBuilder()
    for (char in input) {
        val index = (alphabet.indexOf(char) - 3 + 26) % 26
        decryptedWord.append(alphabet[index])
    }
    return decryptedWord.toString()
}

fun main() {
    val input = readln().trim()
    val decryptedWord = decryptCaesarCipher(input)
    println(decryptedWord)
}
