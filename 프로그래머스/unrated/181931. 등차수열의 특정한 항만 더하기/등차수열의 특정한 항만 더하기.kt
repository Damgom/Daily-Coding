class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        var index = 0
        for (x in included) {
            if (x) answer += a + (d * index)
            index++
        }
        return answer
    }
}