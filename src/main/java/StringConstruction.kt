const val EXAMPLE_1 = "abcd"
const val EXAMPLE_2 = "abab"
const val EXAMPLE_3 = "ultgowvccmbakiqwbqrmwkgsrkvffphmoixkoohwdtjwxsxqxvduosplgatmrtpesbwbbiernonisoshxvfl"

fun stringConstruction(s: String): Int {
    val characters = mutableListOf<Char>()
    for (value in s) {
        if (!characters.contains(value)) {
            characters.add(value)
        }
    }
    return characters.size
}


fun main() {
    println(stringConstruction(EXAMPLE_3))
}

