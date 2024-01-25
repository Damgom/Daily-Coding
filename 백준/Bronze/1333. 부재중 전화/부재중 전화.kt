import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var (N, L, D) = br.readLine()!!.split(" ").map { it.toInt() }
    L += 5
    var num = 0
    var time = D
    for(i in 0..<N){
        num += L
        while(true){
            if(time < num - 5) {
                time += D
            }
            else break
        }
        if(num - 5 <= time && time < num) break
    }
    println(time)
}