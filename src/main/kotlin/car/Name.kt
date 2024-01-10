package car

data class Name(val value: String) {
    init {
        require(!value.isNullOrBlank() && value.length <= 5) {
            "[ERROR] 이름은 1 ~ 5 사이의 길이를 만족해야 합니다."
        }
    }
}
