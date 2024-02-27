package Del_1.Day_6_2021

import java.io.File

// https://adventofcode.com/2021/day/6
    class Day_6_2021_fore {
        fun calculateFish(inputDays: Int, numbersInput: MutableList<Int>): Int {
            val days = inputDays

            for (i in 1..days) {
                for (j in numbersInput.indices) {
                    if (numbersInput[j] > 0) {
                        numbersInput[j]--
                    } else if (numbersInput[j] == 0) {
                        numbersInput[j] = 6
                        numbersInput.add(8)
                    }
                }
            }
            return numbersInput.size
        }
    fun parseInput(filePath: String): MutableList<Int> {
        return File(filePath).readText().split(",").map { it.trim().toInt() }.toMutableList()
    }

}

class Day_6_2021_efter(input: String) {
//https://github.com/tginsberg/advent-2021-kotlin/blob/master/src/main/kotlin/com/ginsberg/advent2021/Day06.kt
    private val fishiesPerDay: LongArray = parseInput(input)
    fun calculateFish(): Long =
        simulateDays(80)

    private fun simulateDays(days: Int): Long {
        repeat(days) {
            fishiesPerDay.rotateLeftInPlace()
            fishiesPerDay[6] += fishiesPerDay[8]
        }
        return fishiesPerDay.sum()
    }

    private fun LongArray.rotateLeftInPlace() {
        val leftMost = first()
        this.copyInto(this, startIndex = 1)
        this[this.lastIndex] = leftMost
    }

    private fun parseInput(input: String): LongArray {
        val numbers = input.split(",").map { it.trim().toInt() }
        val maxNumber = maxOf(numbers.maxOrNull() ?: 0, 8)
        return LongArray(maxNumber + 1).apply {
            numbers.forEach { this[it] += 1L }
        }
    }
}

fun main() {
    val fore = Day_6_2021_fore()
    val efter = Day_6_2021_efter(File("src/main/kotlin/Del_1/input_day_6_2021.txt").readText())
    println(fore.calculateFish(80, fore.parseInput("src/main/kotlin/Del_1/input_day_6_2021.txt")))
    println(efter.calculateFish())

}

