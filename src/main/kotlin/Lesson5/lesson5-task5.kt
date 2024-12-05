fun main() {
    val secretNumbers = List(3) {(0..43).random()}
    println("Угадайте три числа от 0 до 42")
    val userNumbers = List(3) { readln().toInt()}
    val matches = secretNumbers.intersect(userNumbers.toSet()).size
    when (matches) {
        3 -> println("Вы угадали все числа и выйграли джекпот!")
        2 -> println("Вы угадали два числа и выйграли крупный приз!")
        1 -> println("Вы угадали одно число и выйграли утешительный приз.")
        else -> println("Вы не угадали ни одного числа и ничего не выйграли.")
    }
    println("Выигрышные числа: $secretNumbers")
}