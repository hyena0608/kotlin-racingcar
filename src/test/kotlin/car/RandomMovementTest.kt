package car

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.RepeatedTest

class RandomMovementTest {

    @RepeatedTest(10)
    fun success_move() {
        // given
        val randomMovement = RandomMovement()

        // when
        val distance = randomMovement.move()

        // then
        assertThat(distance).isIn(0, 1)
    }
}
