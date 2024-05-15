import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val arr = br.readLine().toCharArray()
    val stack = Stack<Int>()
    for (i in arr.indices) {
        if (arr[i] == 'H') {
            stack.push(1)
        } else if (arr[i] == 'C') {
            stack.push(12)
        } else if (arr[i] == 'O') {
            stack.push(16)
        } else if (arr[i] in '2'..'9') {
            stack.push(stack.pop() * (arr[i].code - '0'.code))
        } else if (arr[i] == ')') {
            var temp = 0
            while (true) {
                if (stack.peek() == 0) {
                    stack.pop()
                    stack.push(temp)
                    break
                }
                temp += stack.pop()
            }
        } else if (arr[i] == '(') {
            stack.push(0)
        }
    }
    var answer = 0
    while (!stack.isEmpty()) {
        answer += stack.pop()
    }
    println(answer)
}
