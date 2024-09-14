fun main() {
    println("Введите строку:")
    val input = readLine() ?: ""


    val charCount = mutableMapOf<Char, Int>()

    for (char in input) {
        if (char.isLetter()) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }
    }

    charCount.toSortedMap().forEach { (char, count) ->
        println("$char - $count")
    }
}
