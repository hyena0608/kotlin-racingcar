package car

import kotlin.random.Random

private const val MIN_NUMBER = 0
private const val MAX_NUMBER = 10
private const val STOP = 0
private const val MOVE = 1

class RandomMovement : Movement {
    override fun move(): Int {
        val randomValue = Random.nextInt(MIN_NUMBER, MAX_NUMBER)
        if (randomValue in 0..3) {
            return STOP
        }
        if (randomValue in 5..9) {
            return MOVE
        }
        return STOP
    }
}
