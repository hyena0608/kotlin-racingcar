import console.ConsoleInput
import console.ConsoleOutput
import racing.Racing

fun main() {
    val consoleInput = ConsoleInput()
    val consoleOutput = ConsoleOutput()

    val carNames = consoleInput.readCarNames()
    val racing = Racing(carNames)

    for (i in 1..consoleInput.readRacingTimes()) {
        racing.race()
        consoleOutput.printCars(racing.cars)
    }
}
