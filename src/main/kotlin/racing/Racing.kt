package racing

import car.Car
import car.Cars
import car.Distance
import car.Name

data class Racing(
    val cars: Cars,
    var raceCount: Count = Count(0)
) {
    constructor(carNames: List<String>) : this(
        Cars(
            carNames.stream()
                .map {
                    Car(Name(it), Distance(0))
                }.toList()
        )
    )

    fun race() {
        cars.moveAll()
        raceCount = raceCount.increase()
    }
}
