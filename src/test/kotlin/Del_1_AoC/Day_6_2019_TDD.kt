import Del_1_AoC.Day_6_2019.Day_6_2019_efter
import Del_1_AoC.Day_6_2019.Day_6_2019_fore
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day_6_2019_TDD {

    @Test
    fun testCalcOrbit() {
        val testFore = Day_6_2019_fore()
        val testEfter = Day_6_2019_efter()

        val result = testFore.calcOrbit("src/main/kotlin/Del_1/Day_6_2019/input.txt")
        assertEquals(227612, result)
        val result2 = testEfter.calcOrbit("src/main/kotlin/Del_1/Day_6_2019/input.txt")
        assertEquals(227612, result2)

        val result3 = testFore.calcOrbit("src/test/kotlin/Del_1/Day_6_2019_TDD_Input.txt")
        assertEquals(42, result3)
        val result4 = testEfter.calcOrbit("src/test/kotlin/Del_1/Day_6_2019_TDD_Input.txt")
        assertEquals(42, result4)
    }
}

