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
}
