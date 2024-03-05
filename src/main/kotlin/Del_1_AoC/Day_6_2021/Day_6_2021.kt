package Del_1_AoC.Day_6_2021

import java.io.File

// https://adventofcode.com/2021/day/6
    class Day_6_2021_fore {
        // Skapar en unik fisk för varje iteration
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

class Day_6_2021_efter {
    // Lagrar antalet fiskar baserat på ålder
    //https://github.com/tginsberg/advent-2021-kotlin/blob/master/src/main/kotlin/com/ginsberg/advent2021/Day06.kt
        private lateinit var fishiesPerDay: LongArray
    fun calculateFish(inputDays: Int, numbersInput: MutableList<Int>): Long {
        fishiesPerDay = parseNumbers(numbersInput)
        return simulateDays(inputDays)
    }
        private fun simulateDays(days: Int): Long {
            repeat(days) { // Upprepar följande kodblock 'days' antal gånger
                fishiesPerDay.rotateLeftInPlace()
                fishiesPerDay[6] += fishiesPerDay[8] // Lägger till värdet på index 8 till värdet på index 6 i 'fishiesPerDay'
            }
            return fishiesPerDay.sum()
        }
        private fun LongArray.rotateLeftInPlace() {
            val leftMost = first() // Sparar det första värdet i arrayen i variabeln 'leftMost'
            this.copyInto(this, startIndex = 1) // Kopierar alla värden i arrayen till sig själv, men startar på index 1
            this[this.lastIndex] = leftMost //Sätter det sista värdet i arrayen till 'leftMost'
        }
        private fun parseNumbers(input: List<Int>): LongArray {
            val maxNumber = maxOf(input.maxOrNull() ?: 0, 8) // Hittar det största talet i 'input' eller 0 om 'input' är tom,
            // och returnerar det största av detta tal och 8
            return LongArray(maxNumber + 1).apply { // Skapar en LongArray med storleken 'maxNumber + 1'
                // och tillämpar följande kodblock på den
                input.forEach { this[it] += 1L } // För varje tal i 'input', öka värdet på motsvarande index i arrayen med 1
            }
        }
    fun parseInput(filePath: String): MutableList<Int> {
        return File(filePath).readText().split(",").map { it.trim().toInt() }.toMutableList()
    }

}
fun main() {
    val fore = Day_6_2021_fore()
    val efter = Day_6_2021_efter()
    println(fore.calculateFish(80, fore.parseInput("src/main/kotlin/Del_1/Day_6_2021/input_day_6_2021.txt")))
    println(efter.calculateFish(80, efter.parseInput("src/main/kotlin/Del_1/Day_6_2021/input_day_6_2021.txt")))
    }



