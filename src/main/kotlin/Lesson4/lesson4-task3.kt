const val REQUIRED_HUMIDITY = 20
const val PROHIBITED_SEASON = "зима"

fun main() {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val humidity: Int = 20
    val isSeason: String = "зима"

    val result: Boolean = isSunny && isAwningOpen && (humidity == REQUIRED_HUMIDITY) && (isSeason != PROHIBITED_SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}