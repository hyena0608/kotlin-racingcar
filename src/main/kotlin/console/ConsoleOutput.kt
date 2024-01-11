package console

import car.Cars

class ConsoleOutput {
    fun printResultAnnounce() {
        println("실행 결과")
    }

    fun printCars(cars: Cars) {
        cars.cars.forEach {
            println(
                "${it.name.value} : ${"-".repeat(it.distance.value)}"
            )
        }
        println()
    }

    fun printResult(winnerCarNames: String) {
        println("${winnerCarNames}가 최종 우승했습니다.")
    }
}
