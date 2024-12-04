package Lesson5


fun main() {

    val num1 = 2
    val num2 = 2
    val task = "$num1 + $num2"
    val taskResponse = num1 + num2
    println(
        """
        |Решите задачу, чтобы войти
        |$task""".trimMargin()
    )

    val captcha = readln().toInt()

    if (captcha == taskResponse) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}