package car

data class Car(val name: Name, var distance: Distance) {
    fun move(requestDistance: Distance) {
        this.distance = distance.move(requestDistance)
    }
}
