package racing

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RacingTest {

    @Test
    fun success_race() {
        // given
        val racing = Racing(listOf("1", "2", "3", "4"))

        // when
        racing.race()

        // then
        assertThat(racing.raceCount).isEqualTo(Count(1))
    }
}
