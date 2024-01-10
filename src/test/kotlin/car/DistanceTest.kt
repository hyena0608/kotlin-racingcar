package car

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class DistanceTest {

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3, 4, 5])
    fun success_create(value: Int) {
        assertThatCode {
            Distance(value)
        }.doesNotThrowAnyException()
    }

    @ParameterizedTest
    @ValueSource(ints = [-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5])
    fun success_move(value: Int) {
        // given
        val distance = Distance(0)

        // when
        val actual = distance.move(Distance(value))
        val expected = Distance(value)

        // then
        assertThat(actual).isEqualTo(expected)
    }
}
