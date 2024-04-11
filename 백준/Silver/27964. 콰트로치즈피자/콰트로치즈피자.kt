fun main() {
    val n = readln().toInt()
    val ingredients = readln().split(" ")
    val map = mutableMapOf<String, Int>()
    for (ingredient in ingredients) {
        if (ingredient.endsWith("Cheese")) {
            map[ingredient] = map.getOrDefault(ingredient, 1) + 1
        }
    }
    println(if (map.size >= 4) "yummy" else "sad")
}