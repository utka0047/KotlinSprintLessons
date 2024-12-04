import java.time.LocalDate
const val AGE_OF_MAJORITY = 18

fun main() {

    val yearOfBirth = readln().toInt()
    val currentYear = (LocalDate.now()).year
    val userAge = currentYear - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }

}