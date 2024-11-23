package org.example.Lesson1

fun main() {

    val totalSeconds: Short = 6480

    val hoursInSpace: Int = totalSeconds / 3600
    val remainingSecondsAfterHours: Int = totalSeconds % 3600
    val minutes: Int = remainingSecondsAfterHours /  60
    val seconds: Int = remainingSecondsAfterHours % 60

    val formattedTimeInSpace = String.format("%02d:%02d:%02d", hoursInSpace, minutes, seconds)

    println(formattedTimeInSpace)
}