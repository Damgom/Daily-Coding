fun main() {
    val num = readln().toInt()
    var list = mutableListOf<Int>()
    for (i in num / 2..num) {
        var curNum = 0
        val curList = mutableListOf<Int>()
        curList.add(num)
        curList.add(i)
        var index = 0
        while (true) {
            curNum = curList[index] - curList[index + 1]
            if (curNum < 0) break
            else {
                curList.add(curNum)
                index++
            }
        }
        if (curList.size > list.size) {
            list = curList
        }
    }
    println(list.size)
    println(list.joinToString(" "))
}