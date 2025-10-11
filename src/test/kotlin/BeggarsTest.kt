import org.example.problems.english_beggars.EnglishBeggars
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BeggarsTest {

    private lateinit var englishBeggars : EnglishBeggars

    @BeforeEach
    fun setup() {
        englishBeggars = EnglishBeggars()
    }

    @Test
    fun basicTests() {
        assertEquals(listOf(15), englishBeggars.beggars(listOf(1,2,3,4,5), 1))
        assertEquals(listOf(9,6), englishBeggars.beggars(listOf(1,2,3,4,5), 2))
        assertEquals(listOf(5,7,3), englishBeggars.beggars(listOf(1,2,3,4,5), 3))
        assertEquals(listOf(1,2,3,4,5,0), englishBeggars.beggars(listOf(1,2,3,4,5), 6))
        assertEquals(listOf(), englishBeggars.beggars(listOf(1,2,3,4,5), 0))
    }
}