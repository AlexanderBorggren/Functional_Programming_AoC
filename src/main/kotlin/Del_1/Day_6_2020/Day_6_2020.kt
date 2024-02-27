package Del_1.Day_6_2020

import java.io.File

class Day_6_2020_fore {

    fun countYes(input: String): Int {
        val groups = input.split("\n\n")
        val groupedResponses = groups.map { it.split("\n") }
        val uniqueAnswers = groupedResponses.map { group -> group.flatMap { it.toList() }.toSet().size }
        val count = uniqueAnswers.sum()
        return count
    }
}

fun main() {
        val fore = Day_6_2020_fore()
        val input = File("src/main/kotlin/Del_1/Day_6_2020/input.txt").readText()
        println(fore.countYes(input))

    val efter = Day_6_2020_efter()
    efter.day_6_2020_efter()
    }

class Day_6_2020_efter {
    val newLine = System.lineSeparator()
    fun day_6_2020_efter() {

        val groups: List<String> = File("src/main/kotlin/Del_1/Day_6_2020/input.txt")
            .readText()
            .trim()
            .split("$newLine$newLine")

        val firstAnswer = groups.sumOf {
            it.replace(newLine, "").toSet().size
        }

        println("$firstAnswer")

    }
}
