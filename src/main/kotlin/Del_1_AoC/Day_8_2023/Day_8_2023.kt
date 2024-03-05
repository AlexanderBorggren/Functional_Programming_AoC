package Del_1_AoC.Day_8_2023

import java.io.File

class Day_8_2023_fore(input: List<String>) {
    val input = input
    fun parseDirectionsInput(): List<String> {
        val directions = mutableListOf<String>()
        val line = input[0]

        for (char in line) {
            directions.add(char.toString())
        }
        return directions
    }

    fun parseCoordinatesInput(): Map<String, Pair<String, String>> {
        val coordinates = mutableMapOf<String, Pair<String, String>>()

        for (i in 2 until input.size) {
            val line = input[i]
            val parts = line.split(" = ")
            val key = parts[0]
            val direction = parts[1].removeSurrounding("(", ")").split(", ")
            val value = Pair(direction[0], direction[1])
            coordinates[key] = value
        }

        return coordinates
    }

    fun findNextCord(currentCord: String, direction: String, coordinates: Map<String, Pair<String, String>>): String {
        val pair = coordinates[currentCord] ?: throw IllegalArgumentException()
        return if (direction == "L") pair.first else pair.second
    }

    fun solveSteps(): Int {
        val coordinates = parseCoordinatesInput()
        val directions = parseDirectionsInput()

        var currentCord = "AAA"
        var counter = 0
        while (currentCord != "ZZZ") {
            val direction = directions[counter % directions.size]
            currentCord = findNextCord(currentCord, direction, coordinates)
            counter++
        }
        println(counter)
        return counter
    }
}

class Day_8_2023_efter(input: List<String>) {
//https://todd.ginsberg.com/post/advent-of-code/2023/day8

        private val instructions: String = input.first()
        private val routeMap: Map<String, Pair<String, String>> = parseRouteMap(input)
        fun solveSteps(): Int =
            countSteps("AAA")

        private fun countSteps(start: String): Int {
            var steps = 0
            var current = start
            while (!current.endsWith("Z")) {
                current = routeMap.getValue(current).let { route ->
                    val instruction = instructions[steps++ % instructions.length]
                    if (instruction == 'L') route.first
                    else route.second
                }
            }
            println(steps)
            return steps
        }

        private fun parseRouteMap(input: List<String>): Map<String, Pair<String, String>> =
            input
                .drop(2)
                .associate {
                    it.substring(0..2) to (it.substring(7..9) to it.substring(12..14))
                }
    }

fun main(){
    val fore = Day_8_2023_fore(File("src/main/kotlin/Del_1/Day_8_2023/input.txt").readLines())
    fore.solveSteps()

    val efter = Day_8_2023_efter(File("src/main/kotlin/Del_1/Day_8_2023/input.txt").readLines())
    efter.solveSteps()
}