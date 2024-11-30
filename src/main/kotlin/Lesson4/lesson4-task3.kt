const val REQUIRED_HUMIDITY = 20
const val PROHIBITED_SEASON = "зима"

fun main() {

    val isSunny: Boolean = true
    val tent: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    val result: Boolean = isSunny && tent && (humidity == REQUIRED_HUMIDITY) && (season != PROHIBITED_SEASON)
    println("Благоприятные ли условия сейчас для роста бобовых? $result")
}