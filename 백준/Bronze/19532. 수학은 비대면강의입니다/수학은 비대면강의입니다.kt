fun main() {
    val br = System.`in`.bufferedReader()
    val inputList = br.readLine()!!.split(" ").map { it.toInt() }
    val x = (inputList[2] * inputList[4] - inputList[1] * inputList[5]) / (inputList[0] * inputList[4] - inputList[1] * inputList[3])
    val y = (inputList[2] * inputList[3] - inputList[0] * inputList[5]) / (inputList[1] * inputList[3] - inputList[0] * inputList[4])
    println("$x $y")
}
