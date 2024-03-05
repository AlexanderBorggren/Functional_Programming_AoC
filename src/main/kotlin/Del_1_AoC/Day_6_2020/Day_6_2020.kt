package Del_1_AoC.Day_6_2020

import java.io.File

class Day_6_2020_fore {

    fun countYes(input: File): Int {
        val input = input.readText()
        val groups = input.split("\n\n")
        val groupedResponses = groups.map { it.split("\n") }
        val uniqueAnswers = groupedResponses.map { group -> group.flatMap { it.toList() }.toSet().size }
        val count = uniqueAnswers.sum()
        println(count)
        return count
    }
}
class Day_6_2020_efter {
    //https://github.com/kotlin-hands-on/advent-of-code-2020/blob/master/src/day06/day6.kt
    val newLine = System.lineSeparator()
    fun countYes(groups: File): Int {

        val groups: List<String> = groups
            .readText()
            .trim()
            .split("$newLine$newLine")

        val firstAnswer = groups.sumOf {
            it.replace(newLine, "").toSet().size
        }

        println("$firstAnswer")
        return firstAnswer
    }
}

fun main() {
    val fore = Day_6_2020_fore()
    fore.countYes(File("src/main/kotlin/Del_1/Day_6_2020/input.txt"))

    val efter = Day_6_2020_efter()
    efter.countYes(File("src/main/kotlin/Del_1/Day_6_2020/input.txt"))
}
