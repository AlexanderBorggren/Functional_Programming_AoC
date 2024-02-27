package Del_1.Day_6_2019

import java.io.File


class Day_6_2019_fore {
    fun calcOrbit() {
        var eachRow: List<String> = File("src/main/kotlin/Del_1/Day_6_2019/input.txt")
            .readText()
            .trim()
            .split("\n")

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
    }
}

    class Day_6_2019_efter {

        private var input: List<String> = File("src/main/kotlin/Del_1/Day_6_2019/input.txt")
            .readText()
            .trim()
            .split("\n")

        private val orbitPairs: Map<String, String> =
            input.map { it.split(")") }.map { it.last() to it.first() }.toMap()

        fun solvePart1(): Int {
            val returnValue = orbitPairs.keys.sumOf { pathTo(it).size - 1 }
            return returnValue
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

    fore.calcOrbit()
    println(efter.solvePart1())

}

