package Lesson5


fun main() {

    val task = "2+2"
    val taskResponse = 2+2
    println("""
        |Решите задачу, чтобы войти
        |$task""".trimMargin())

    val captcha = readln().toInt()

    if (captcha == taskResponse) {
        println("Добро пожаловать!")
    }
    else {
        println("Доступ запрещен.")
    }

}