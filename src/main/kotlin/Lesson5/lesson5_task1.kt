package Lesson5


fun main() {

    println("""
        |Решите задачу, чтобы войти
        |2+2""".trimMargin())

    val captcha = readln().toInt()

    if (captcha == 2+2) {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещен.")
    }

}