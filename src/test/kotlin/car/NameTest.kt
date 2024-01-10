package car

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.lang.IllegalArgumentException
import kotlin.reflect.typeOf

class NameTest {

    @ParameterizedTest
    @ValueSource(strings = ["1", "12", "123", "1234", "12345"])
    fun success_create(value: String) {
        assertThatCode {
            Name(value)
        }.doesNotThrowAnyException()
    }

    @ParameterizedTest
    @ValueSource(strings = ["", " ", "123456", "1234567"])
    fun exception_create(value: String) {
        assertThatThrownBy {
            Name(value)
        }.isInstanceOf(IllegalArgumentException::class.java)
    }
}
