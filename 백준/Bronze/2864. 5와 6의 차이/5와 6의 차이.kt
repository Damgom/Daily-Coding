fun main() {
    val br = System.`in`.bufferedReader()
    val (a, b) = br.readLine()!!.split(" ")
    val minValue = a.replace("6", "5").toInt() + b.replace("6", "5").toInt()
    val maxValue = a.replace("5", "6").toInt() + b.replace("5", "6").toInt()
    println("$minValue $maxValue")
}