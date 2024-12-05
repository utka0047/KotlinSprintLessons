package Lesson5

fun main() {

    val num1 = 4
    val num2 = 21

    println("Угадайте два числа от 0 до 42")
    val userNum1 = readln().toInt()
    val userNum2 = readln().toInt()

    if ((userNum1 == num1 && userNum2 == num2) || (userNum1 == num2 && userNum2 == num1)) {
        println("Поздравляем! Вы выиграли главный приз!")
    }
    else if (userNum1 == num1 || userNum1 == num2 || userNum2 == num1 || userNum2 == num2) {
        println("Вы выиграли утешительный приз!")
    }
    else {
        println("Неудача!")
    }
}