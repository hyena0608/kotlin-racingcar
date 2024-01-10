package car

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CarTest {

    @ParameterizedTest
    @ValueSource(strings = ["1", "2", "자동차1", "자동차2", "자동차3"])
    fun success_create(value: String) {
        assertThatCode {
            Car(
                Name(value),
                Distance(0)
            )
        }.doesNotThrowAnyException()
    }

    @ParameterizedTest
    @ValueSource(ints = [-10, -5, 0, 1, 2, 3, 4, 5, 10])
    fun success_move(value: Int) {
        // given
        val actual = Car(
            Name("자동차1"),
            Distance(0)
        )

        // when
        val expected = Distance(value)
        actual.move(expected)

        // then
        assertThat(actual.distance).isEqualTo(expected)
    }
}
