package Del_1_AoC
import Del_1_AoC.Day_6_2021.Day_6_2021_efter
import Del_1_AoC.Day_6_2021.Day_6_2021_fore
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day_6_2021_TDD {
    @Test
    fun testCalculateFish() {
        val testFore = Day_6_2021_fore()
        val testEfter = Day_6_2021_efter()
        val dataFore = testFore.parseInput("src/test/kotlin/Del_1/Day_6_2021_TDD_Input.txt")
        val dataFore2 = testFore.parseInput("src/test/kotlin/Del_1/Day_6_2021_TDD_Input.txt")
        val dataEfter = testEfter.parseInput("src/test/kotlin/Del_1/Day_6_2021_TDD_Input.txt")
        val dataEfter2 = testEfter.parseInput("src/test/kotlin/Del_1/Day_6_2021_TDD_Input.txt")

        val result = testFore.calculateFish(18, dataFore)
        assertEquals(26, result)
        val result2 = testFore.calculateFish(80, dataFore2)
        assertEquals(5934, result2)

        val result3 = testEfter.calculateFish(18, dataEfter)
        assertEquals(26, result3)
        val result4 = testEfter.calculateFish(80, dataEfter2)
        assertEquals(5934, result4)


    }
}

