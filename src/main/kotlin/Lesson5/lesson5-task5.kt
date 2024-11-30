package Lesson5

import kotlin.random.Random

/*
Для алгоритма улучшенного приложения-лотереи нужно угадать три числа от 0 до 42.
Пользователь вводит числа через консоль.

Требования к программе:

- Загаданные числа должны рандомно генерироваться при каждом запуске программы и храниться в списке.
- Поочередно введенные пользователем числа должны также храниться в списке.
- Для определения совпадений используй метод intersect() и сохрани размер полученной коллекции в отдельную переменную.

В зависимости от количества угаданных чисел программа выводит результат:

- При трех совпадениях сообщается, что пользователь угадал все числа и выиграл джекпот.
- При двух совпадениях информируется о том, что пользователь угадал два числа и получает крупный приз.
- Если угадано одно число, пользователю выплачивается утешительный приз.
- Если нет совпадений, программа сообщает, что пользователь не угадал ни одного числа.
- В конце игры вне зависимости от результата программа выводит выигрышные числа.
 */


fun main() {

    val secretNumbers = List(3) {Random.nextInt(0,43)}

    println("Угадайте три числа от 0 до 42")
    val userNumbers = List(3) { readln().toInt()}
    val matches = secretNumbers.intersect(userNumbers.toSet()).size

    when (matches) {
        3 -> println("Вы угадали все числа и выйграли джекпот!")
        2 -> println("Вы угадали два числа и выйграли крупный приз!")
        1 -> println("Вы угадали одно число и выйграли утешительный приз.")
        else -> println("Вы не угадали ни одного числа и ничего не выйграли.")
    }

}