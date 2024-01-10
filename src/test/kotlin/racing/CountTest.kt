package racing

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CountTest {

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3, 4, 5])
    fun success_create(value: Int) {
        assertThatCode {
            Count(value)
        }.doesNotThrowAnyException()
    }

    @ParameterizedTest
    @ValueSource(ints = [-1, -2, -3, -4, -5])
    fun exception_create(value: Int) {
        assertThatThrownBy {
            Count(value)
        }.isInstanceOf(IllegalArgumentException::class.java)
    }

    @Test
    fun success_increase() {
        // given
        val count = Count(0)

        // when
        val actual = count.increase()

        // then
        assertThat(actual).isEqualTo(Count(1))
    }
}
