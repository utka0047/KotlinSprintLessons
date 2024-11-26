package Lesson2

//Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия
//вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.
//– Создай целочисленные переменные и проинициализируй их этими данными;
//– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//– Выведи результат в консоль.

const val MINUTE_IN_HOUR = 60
const val HOURS_IN_DAY = 24

fun main() {
    val departureHour = 9
    val departureMinute = 39

    val travelMinutes = 457
    val totalMinutes = departureHour * MINUTE_IN_HOUR + departureMinute + travelMinutes

    val arrivalHour = (totalMinutes / MINUTE_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinute = totalMinutes % MINUTE_IN_HOUR
    val arrivalTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)
    println(arrivalTime)
}
