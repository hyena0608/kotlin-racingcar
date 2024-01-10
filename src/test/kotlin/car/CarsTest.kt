package car

import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Test

class CarsTest {

    @Test
    fun success_create() {
        // given
        val cars: List<Car> = listOf(
            Car(Name("자동차 1"), Distance(0)),
            Car(Name("자동차 2"), Distance(0)),
        )

        // expect
        assertThatCode {
            Cars(cars)
        }.doesNotThrowAnyException()
    }

    @Test
    fun success_moveAll() {
        // given
        val cars: Cars = Cars(
            listOf(
                Car(Name("자동차 1"), Distance(0)),
                Car(Name("자동차 2"), Distance(0)),
            )
        )

        // when
        cars.moveAll();
    }
}
