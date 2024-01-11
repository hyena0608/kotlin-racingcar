package car

class Car(
    val name: Name,
    distance: Distance = ZERO
) {
    var distance: Distance = ZERO
        private set

    fun move(requestDistance: Distance) {
        this.distance = distance.move(requestDistance)
    }
}
