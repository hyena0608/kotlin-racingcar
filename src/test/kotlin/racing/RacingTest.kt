package racing

import car.Car
import car.Cars
import car.Distance
import car.Name
import car.stub.MovementDistanceOneStub
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Test

class RacingTest {

    private val movement = MovementDistanceOneStub()

    @Test
    fun success_create() {
        assertThatCode {
            Racing(
                createCars(listOf("1", "2", "3", "4"))
            )
        }.doesNotThrowAnyException()
    }

    private fun createCars(carNames: List<String>): Cars {
        return Cars(
            carNames.stream()
                .map {
                    Car(Name(it), Distance(0))
                }.toList()
        )
    }

    @Test
    fun success_race() {
        // given
        val racing = Racing(
            createCars(listOf("1", "2", "3", "4"))
        )

        // when
        racing.race(movement)

        // then
        assertThat(racing.raceCount).isEqualTo(Count(1))
    }

    @Test
    fun success_findWinners() {
        // given
        val car1 = Car(Name("1"))
        val car2 = Car(Name("2"))
        val car3 = Car(Name("3"))

        val racing = Racing(
            Cars(listOf(car1, car2, car3))
        )

        racing.race(movement)

        // when
        val actual = racing.findWinners()

        // then
        assertThat(actual.winnerNames).containsExactly("1", "2", "3")
    }
}
