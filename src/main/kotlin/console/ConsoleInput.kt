package console

import java.util.function.Supplier

private const val MAX_TRY_COUNT: Int = 20
private const val INIT_TRY_COUNT: Int = 0

class ConsoleInput {
    fun readCarNames(): List<String> {
        return handleException({
            println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
            readln().split(",").toList()
        }, INIT_TRY_COUNT)
    }

    fun readRacingTimes(): Int {
        return handleException({
            println("시도할 회수는 몇회인가요?")
            readln().toInt()
        }, INIT_TRY_COUNT)
    }

    private fun <T> handleException(supplier: Supplier<T>, tryCount: Int): T {
        if (tryCount >= MAX_TRY_COUNT) {
            throw RuntimeException("[ERROR] 예외 핸들링을 ${MAX_TRY_COUNT}번 이상 시도했음에도 정상 동작되지 않았습니다.")
        }

        try {
            return supplier.get()
        } catch (e: RuntimeException) {
            return handleException(supplier, tryCount + 1)
        }
    }
}
