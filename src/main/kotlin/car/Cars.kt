package car

import kotlin.random.Random

data class Cars(val cars: List<Car>) {
    init {
        require(!cars.isNullOrEmpty()) {
            "[ERROR] 자동차 목록은 null 이거나 비어있을 수 없습니다."
        }
    }

    fun moveAll() {
        cars.forEach { car ->
            val randomValue = Random.nextInt(0, 10)
            if (randomValue in 0..3) {
                car.move(Distance(0))
            }
            if (randomValue in 5..9) {
                car.move(Distance(1))
            }
        }
    }
}
