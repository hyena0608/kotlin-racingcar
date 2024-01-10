package car

data class Distance(val value: Int) {
    fun move(requestDistance: Distance): Distance {
        return Distance(requestDistance.value + value)
    }
}
