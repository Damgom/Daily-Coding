fun main() {
    val v = readLine()!!.toInt()
    val vote = readLine()!!
    val aCount = vote.count { it == 'A'}
    val bCount = v - aCount
    
    println(if (aCount == bCount) "Tie" else if (aCount > bCount) "A" else "B")
}
