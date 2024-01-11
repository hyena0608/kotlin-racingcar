package car

import car.stub.MovementDistanceOneStub
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Test

class CarsTest {

    private var movement: Movement = MovementDistanceOneStub()

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
    fun success_findFurthestCars() {
        // given
        val car1 = Car(Name("자동차 1"))
        val car2 = Car(Name("자동차 2"))
        val cars = Cars(
            listOf(car1, car2)
        )

        // when
        val actual = cars.findFurthestCars()

        // then
        assertThat(actual).containsExactly(car1, car2)
    }
}
