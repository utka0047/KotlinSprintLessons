package Lesson2

fun main() {

    val students = 4
    val scores = 3 + 4 + 3 + 4
    val average = (scores).toFloat() / students
    val formattedAverage = "%.2f".format(average)

    println(formattedAverage)
}