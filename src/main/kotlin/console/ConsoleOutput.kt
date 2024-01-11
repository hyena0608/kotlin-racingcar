package console

import car.Cars

class ConsoleOutput {
    fun printCars(cars: Cars) {
        cars.cars.forEach {
            println(
                "${it.name.value} : ${"-".repeat(it.distance.value)}"
            )
        }
        println()
    }
}
