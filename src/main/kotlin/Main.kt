import car.*
import console.ConsoleInput
import console.ConsoleOutput
import racing.Racing
import java.util.stream.Collectors

private val movement = RandomMovement()

fun main() {
    val consoleInput = ConsoleInput()
    val consoleOutput = ConsoleOutput()

    val carNames = consoleInput.readCarNames()
    val racing = Racing(
        createCars(carNames)
    )

    val racingTimes = consoleInput.readRacingTimes()
    consoleOutput.printResultAnnounce()
    for (i in 1..racingTimes) {
        racing.race(movement)
        consoleOutput.printCars(racing.cars)
    }

    consoleOutput.printResult(collectWinnerCarNames(racing))
}

private fun createCars(carNames: List<String>): Cars {
    return Cars(
        carNames.stream()
            .map {
                Car(Name(it), Distance(0))
            }.toList()
    )
}

private fun collectWinnerCarNames(racing: Racing): String {
    return racing.findWinners()
        .winnerNames
        .stream()
        .collect(Collectors.joining(", "))
}
