import Del_2.Tomteland
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class TomtelandTest {

    val tlTest = Tomteland()
    @Test
    fun underlingsBladlusenTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Bladlusen", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsTrögerTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Tröger", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }
    @Test
    fun underlingsBlygerTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Blyger", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }
    @Test
    fun underlingsDammråttanTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Dammråttan", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }
    @Test
    fun underlingsGråsugganTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Gråsuggan", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }
    @Test
    fun underlingsHarenTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Haren", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }

    @Test
    fun underlingsNyckelpiganTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Nyckelpigan", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }
    @Test
    fun underlingsRådjuretTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Rådjuret", list, tlTest.chefshierarki)
        assertEquals(0, underlings.size)
    }
    @Test
    fun underlingsMyranTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Myran", list, tlTest.chefshierarki)
        val underlingsTempList = listOf("Bladlusen")
        assertEquals(underlingsTempList.size, underlings.size)
        assertTrue(underlings.containsAll(underlingsTempList))
    }
    @Test
    fun underlingsRävenTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Räven", list, tlTest.chefshierarki)
        val underlingsTempList = listOf("Gråsuggan", "Myran","Bladlusen")
        assertEquals(underlingsTempList.size, underlings.size)
        assertTrue(underlings.containsAll(underlingsTempList))
    }
    @Test
    fun underlingsSkumtomtenTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Skumtomten", list, tlTest.chefshierarki)
        val underlingsTempList = listOf("Dammråttan")
        assertEquals(underlingsTempList.size, underlings.size)
        assertTrue(underlings.containsAll(underlingsTempList))
    }
    @Test
    fun underlingsTrötterTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Trötter", list, tlTest.chefshierarki)
        val underlingsTempList = listOf("Skumtomten", "Dammråttan")
        assertEquals(underlingsTempList.size, underlings.size)
        assertTrue(underlings.containsAll(underlingsTempList))
    }
    @Test
    fun underlingsButterTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Butter", list, tlTest.chefshierarki)
        val underlingsTempList = listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Myran","Gråsuggan","Bladlusen")
        assertEquals(underlingsTempList.size, underlings.size)
        assertTrue(underlings.containsAll(underlingsTempList))
    }
    @Test
    fun underlingsGladerTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Glader", list, tlTest.chefshierarki)
        val underlingsTempList = listOf("Tröger", "Trötter", "Blyger", "Skumtomten", "Dammråttan")
        assertEquals(underlingsTempList.size, underlings.size)
        assertTrue(underlings.containsAll(underlingsTempList))
    }

    @Test
    fun underlingsTomtenTest() {
        val list = mutableListOf<String>()
        val underlings = tlTest.getUnderlings("Tomten", list, tlTest.chefshierarki)
        val underlingsTempList = listOf("Glader","Butter","Tröger", "Trötter", "Blyger", "Skumtomten", "Dammråttan",
            "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Myran","Gråsuggan","Bladlusen")
        assertEquals(underlingsTempList.size, underlings.size)
        assertTrue(underlings.containsAll(underlingsTempList))
    }


}
