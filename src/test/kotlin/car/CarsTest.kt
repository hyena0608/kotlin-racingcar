package car

import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Test

class CarsTest {

    private var movement: Movement = RandomMovement()

    @Test
    fun success_create() {
        // given
        val cars: List<Car> = listOf(
            Car(Name("자동차 1")),
            Car(Name("자동차 2")),
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
                Car(Name("자동차 1")),
                Car(Name("자동차 2")),
            )
        )

        // when
        cars.moveAll(movement);
    }

    @Test
    fun success_moveAllV2() {
        // given
        val cars: Cars = Cars(
            listOf(
                Car(Name("자동차 1")),
                Car(Name("자동차 2")),
            )
        )

        // when
        cars.moveAll(movement);
    }
}
