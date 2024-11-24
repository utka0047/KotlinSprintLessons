package Lesson2

fun main() {

    var students = 4f
    var scores = 3 + 4 + 3 + 4
    var average = scores / students
    val formattedAverage = "%.2f".format(average)

    println(formattedAverage)
}