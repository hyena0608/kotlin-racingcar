package car


val ZERO = Distance(0)

data class Distance(
    val value: Int
) : Comparable<Distance> {
    fun move(requestDistance: Distance): Distance {
        return Distance(requestDistance.value + value)
    }

    fun isSame(requestDistance: Distance): Boolean {
        return this.value == requestDistance.value
    }

    override fun compareTo(other: Distance): Int {
        if (this.value >= other.value) {
            return 1
        }
        return -1
    }
}
