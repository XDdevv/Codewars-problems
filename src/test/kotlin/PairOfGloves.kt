import org.example.problems.pair_of_gloves.PairOfGloves
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PairOfGloves {

    @Test
    fun sampleTests() {
        val pairOfGloves = PairOfGloves()

        assertEquals(1, pairOfGloves.numberOfPairs( arrayOf("red","red").toList()) )
        assertEquals(0, pairOfGloves.numberOfPairs( arrayOf("red","green","blue").toList()) )
        assertEquals(3, pairOfGloves.numberOfPairs( arrayOf("gray","black","purple","purple","gray","black").toList()) )
        assertEquals(0, pairOfGloves.numberOfPairs( emptyList<String>()) )
        assertEquals(4, pairOfGloves.numberOfPairs( arrayOf("red","green","blue","blue","red","green","red","red","red").toList()) )
    }
}