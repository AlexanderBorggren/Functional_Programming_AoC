package Del_2
class Tomteland {

    val chefshierarki = mapOf(
        "Tomten" to listOf("Glader", "Butter"),
        "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Trötter" to listOf("Skumtomten"),
        "Skumtomten" to listOf("Dammråttan"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
        "Räven" to listOf("Gråsuggan", "Myran"),
        "Myran" to listOf("Bladlusen")
    )

    fun getUnderlings(currentName: String, res: MutableList<String>, hierarchy: Map<String, List<String>>): List<String> {
        hierarchy[currentName]?.forEach { underling ->
            res.add(underling)
            getUnderlings(underling, res, hierarchy)
        }
        return res
    }
}
fun main() {
    val run = Tomteland()
    val underlings = run.getUnderlings("Myran", mutableListOf(), run.chefshierarki)
    println(underlings)
}