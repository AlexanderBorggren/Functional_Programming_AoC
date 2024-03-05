package Del_1_AoC

import Del_1_AoC.Day_8_2023.Day_8_2023_efter
import Del_1_AoC.Day_8_2023.Day_8_2023_fore
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class Day_8_2023_TDD {

    @Test
    fun testSolveSteps(){
        val testFore1 = Day_8_2023_fore(File("src/test/kotlin/Del_1/Day_8_2023_TDD_Input.txt").readLines())
        val testEfter1 = Day_8_2023_efter(File("src/test/kotlin/Del_1/Day_8_2023_TDD_Input.txt").readLines())
        val testFore2 = Day_8_2023_fore(File("src/test/kotlin/Del_1/Day_8_2023_TDD_Input2.txt").readLines())
        val testEfter2 = Day_8_2023_efter(File("src/test/kotlin/Del_1/Day_8_2023_TDD_Input2.txt").readLines())


        val result = testFore1.solveSteps()
        assertEquals(2, result)
        val results2 = testEfter1.solveSteps()
        assertEquals(2, results2)

        val result3 = testFore2.solveSteps()
        assertEquals(6, result3)
        val results4 = testEfter2.solveSteps()
        assertEquals(6, results4)



    }
}
