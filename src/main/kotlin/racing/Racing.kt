package racing

import car.Cars
import car.Movement

class Racing(
    val cars: Cars,
    raceCount: Count = ZERO
) {
    var raceCount: Count = raceCount
        private set

    fun race(movement: Movement) {
        cars.moveAll(movement)
        raceCount = raceCount.increase()
    }

    fun findWinners(): Winners {
        return Winners(
            collectCarNames()
        )
    }

    private fun collectCarNames(): List<String> {
        return cars.cars
            .stream()
            .map { it.name.value }
            .toList()
    }
}
