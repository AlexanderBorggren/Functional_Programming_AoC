package Del_1_AoC

import Del_1_AoC.Day_6_2020.Day_6_2020_efter
import Del_1_AoC.Day_6_2020.Day_6_2020_fore
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

class Day_6_2020_TDD {

    @Test
    fun testCountYes(){
        val testFore = Day_6_2020_fore()
        val testEfter = Day_6_2020_efter()

        val result = testFore.countYes(File("src/test/kotlin/Del_1/Day_6_2020_TDD_Input.txt"))
        assertEquals(11, result)

        val results2 = testEfter.countYes(File("src/test/kotlin/Del_1/Day_6_2020_TDD_Input.txt"))
        assertEquals(11, results2)
    }
}