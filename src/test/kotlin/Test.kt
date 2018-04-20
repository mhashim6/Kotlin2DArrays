import mhashim6.kotlin.arrays2d.asSequence2D
import mhashim6.kotlin.arrays2d.matrix
import org.junit.Test

class Test {

    @Test
    fun generalTest() {
        var count = 0
        val matrix = matrix(4, 4) { i, j -> Pair(i, j) }
        matrix.asSequence2D()
                .filter { it.second > 1 }
                .forEach { count++ }

        assert(count == 8)
    }

}