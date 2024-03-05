package Del_1_AoC

import Del_1_AoC.Day_6_2023.Day_6_2023_efter
import Del_1_AoC.Day_6_2023.Day_6_2023_fore
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class Day_6_2023_TDD {
    @Test
    fun testCountYes(){
        val testFore = Day_6_2023_fore(File("src/test/kotlin/Del_1/Day_6_2023_TDD_Input.txt").readLines())
        val testEfter = Day_6_2023_efter(File("src/test/kotlin/Del_1/Day_6_2023_TDD_Input.txt").readLines())

        val result = testFore.solveWins()
        assertEquals(288, result)

        val results2 = testEfter.solveWins()
        assertEquals(288, results2)
    }
}