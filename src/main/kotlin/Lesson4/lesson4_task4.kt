package Lesson4

fun main() {

    val trainingDay = 5
    val isUpperBodyDay = trainingDay % 2 == 0
    println("""
        |Упражнения для рук:       ${!isUpperBodyDay}
        |Упражнения для ног:       ${isUpperBodyDay}
        |Упражнения для спины:     ${isUpperBodyDay}
        |Упражнения для пресса:    ${!isUpperBodyDay}
        """.trimMargin()
    )
}