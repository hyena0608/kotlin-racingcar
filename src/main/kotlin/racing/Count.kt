package racing

data class Count(val value: Int) {
    init {
        require(value >= 0) {
            "[ERROR] 카운트에 ${value} 값은 음수가 아니어야 합니다."
        }
    }

    fun increase(): Count {
        return Count(value.plus(1))
    }
}
