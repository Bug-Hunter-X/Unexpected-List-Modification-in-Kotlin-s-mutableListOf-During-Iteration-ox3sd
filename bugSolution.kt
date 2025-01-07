fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val evenNumbers = mutableListOf<Int>()
    for (item in list) {
        if (item % 2 == 0) {
            evenNumbers.add(item)
        }
    }
    list.removeAll(evenNumbers)
    println(list)
}