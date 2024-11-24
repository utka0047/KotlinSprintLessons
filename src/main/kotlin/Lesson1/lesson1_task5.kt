package org.example.Lesson1

const val SECONDS_IN_MINUTE: Int = 60
const val SECONDS_IN_HOUR: Int = 3600

fun main() {

    val gagarinTotalSeconds: Int = 6480

    val hours: Int = gagarinTotalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours: Int = gagarinTotalSeconds % SECONDS_IN_HOUR
    val minutes: Int = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds: Int = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println(formattedTime)

}
