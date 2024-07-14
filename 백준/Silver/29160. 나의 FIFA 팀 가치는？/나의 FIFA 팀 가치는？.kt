import java.util.PriorityQueue

data class Player(val position: Int, var value: Int)

fun main() {
    val br = System.`in`.bufferedReader()
    val (N, K) = br.readLine().split(" ").map { it.toInt() }
    val players = mutableListOf<Player>()
    for (i in 0 until N) {
        val (position, value) = br.readLine().split(" ").map { it.toInt() }
        players.add(Player(position, value))
    }

    val team = Array(12) { PriorityQueue<Player>(compareByDescending { it.value }) }
    players.forEach { player ->
        team[player.position].add(player)
    }

    for (year in 1..K) {
        for (queue in team) {
            if (queue.isNotEmpty()) {
                val player = queue.poll()
                if (player.value > 0) {
                    player.value = maxOf(0, player.value - 1)
                    queue.add(player)
                }
            }
        }
    }

    val totalValue = team.sumOf { queue ->
        queue.peek()?.value ?: 0
    }
    println(totalValue)
}
