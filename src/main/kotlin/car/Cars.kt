package car

class Cars(
    val cars: List<Car>
) {
    init {
        require(!cars.isNullOrEmpty()) {
            "[ERROR] 자동차 목록은 null 이거나 비어있을 수 없습니다."
        }
    }

    fun moveAll(movement: Movement) {
        cars.forEach {
            it.move(
                Distance(movement.move())
            )
        }
    }

    fun findFurthestCars(): List<Car> {
        return collectSameDistanceCars(getMaxDistance())
    }

    private fun collectSameDistanceCars(maxDistance: Distance): List<Car> {
        return cars.stream()
            .filter {
                it.isSameDistance(maxDistance)
            }.toList()
    }

    private fun getMaxDistance(): Distance {
        return cars.stream()
            .map(Car::distance)
            .max(Distance::compareTo)
            .orElseThrow {
                IllegalStateException("[ERROR] 자동차 목록이 없어 가장 멀리 있는 자동차 거리를 구할 수 없습니다.")
            }
    }
}
