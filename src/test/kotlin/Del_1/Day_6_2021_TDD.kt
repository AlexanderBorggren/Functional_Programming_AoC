package Del_1
import Del_1.Day_6_2021.Day_6_2021_fore
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day_6_2021_TDD {
    @Test
    fun testCalculateFish() {
        val test = Day_6_2021_fore()

        val tempList = mutableListOf(3,4,3,1,2)
        val tempList2 = mutableListOf(3,4,3,1,2)

        val result = test.calculateFish(18, tempList)
        assertEquals(26, result)
        val result2 = test.calculateFish(80, tempList2)
        assertEquals(5934, result2)

    }
}

