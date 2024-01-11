package car

class Car(
    val name: Name,
    distance: Distance = ZERO
) {
    var distance: Distance = distance
        private set

    fun move(requestDistance: Distance) {
        this.distance = distance.move(requestDistance)
    }

    fun isSameDistance(requestDistance: Distance): Boolean {
        return distance.isSame(requestDistance)
    }
}
