package Del_1_AoC.Day_6_2023

import java.io.File

class Day_6_2023_fore(private val input: List<String>) {
    fun calcEachWin(raceTime: Int, recordDistance: Int): Int {
        var raceTime = raceTime
        var length = 0
        var count = 0
        for (movementSpeed in 0..raceTime) {
            length = raceTime * movementSpeed
            if (length > recordDistance) {
                count++
            }
            raceTime--
        }
        return count
    }

    fun solveWins(): Int{
        val data = parseInput()
        var productOfWins = 1
        data.forEach { (time, distance) ->
            val wins = calcEachWin(time, distance)
            productOfWins *= wins
        }
        println(productOfWins)
        return productOfWins
    }
    fun parseInput(): List<Pair<Int, Int>> {
        val times = input.first().substringAfter(":").split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
        val distances = input.drop(1).first().substringAfter(":").split(" ").filter { it.isNotEmpty() }.map { it.toInt() }
        return times.zip(distances)
    }



}
class Day_6_2023_efter(private val input: List<String>) {
// https://github.com/tginsberg/advent-2023-kotlin/blob/main/src/main/kotlin/com/ginsberg/advent2023/Day06.kt
        fun solveWins(): Long {
            val times = input.first().substringAfter(":").split(" ").filter { it.isNotEmpty() }.map { it.toLong() }
            val distances = input.drop(1).first().substringAfter(":").split(" ").filter { it.isNotEmpty() }.map { it.toLong() }

            println(times.zip(distances)
                .map { race(it.first, it.second) }
                .reduce(Long::times))

            return times.zip(distances)
                .map { race(it.first, it.second) }
                .reduce(Long::times)
        }

        private fun race(time: Long, distance: Long): Long {
            val start = (1 .. time).first { hold ->
                ((time-hold)) * hold > distance
            } -1

            val end = (time downTo 1).first { hold ->
                ((time-hold)) * hold > distance
            }

            return end-start
        }
    }

fun main() {
    val fore = Day_6_2023_fore((File("src/main/kotlin/Del_1/Day_6_2023/input.txt")).readLines())
    fore.solveWins()
    val efter = Day_6_2023_efter((File("src/main/kotlin/Del_1/Day_6_2023/input.txt")).readLines())
    efter.solveWins()

}



