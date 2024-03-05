package Del_1_AoC.Day_6_2019

import java.io.File


class Day_6_2019_fore {
    fun calcOrbit(filePath: String): Int {
        val eachRow = File(filePath).readLines().map {it.trim()}

        val orbits = HashMap<String, String>()

        for (row in eachRow) {
            val (center, orbiter) = row.split(")")
            orbits[orbiter] = center
        }

        var totalOrbits = 0
        for (planet in orbits.keys) {
            var currentPlanet = planet
            while (currentPlanet in orbits) {
                totalOrbits++
                currentPlanet = orbits[currentPlanet]!!
            }
        }

        println(totalOrbits)
        return totalOrbits
    }
}
class Day_6_2019_efter {
    private lateinit var orbitPairs: Map<String, String>
        fun calcOrbit(filePath: String): Int {
            val input = File(filePath).readLines().map { it.trim() }

            orbitPairs = input.map { it.split(")") }.map { it.last() to it.first() }.toMap()

            println(orbitPairs.keys.sumOf { pathTo(it).size - 1 })
            return (orbitPairs.keys.sumOf { pathTo(it).size - 1 })
        }

        private fun pathTo(orbit: String, path: MutableList<String> = mutableListOf(orbit)): List<String> =
            orbitPairs[orbit]?.let { around ->
                path.add(around)
                pathTo(around, path)
            } ?: path
    }

fun main(){
    val fore = Day_6_2019_fore()
    val efter = Day_6_2019_efter()

    fore.calcOrbit("src/main/kotlin/Del_1/Day_6_2019/input.txt")
    efter.calcOrbit("src/main/kotlin/Del_1/Day_6_2019/input.txt")

}

