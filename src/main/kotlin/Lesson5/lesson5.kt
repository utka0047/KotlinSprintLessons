package Lesson5

const val AGE_OF_MAJORITY = 18

fun main() {

    val userAge = readln().toInt()

//    if (userAge >= AGE_OF_MAJORITY) {
//        println("Show special content")
//    }
//
//    if (userAge < AGE_OF_MAJORITY ) {
//        println("Back to main screen")
//    }


    // со фигурными скобками
    // пример с else и else if
//    if (userAge >= AGE_OF_MAJORITY) {
//        println("Show special content")
//    } else if (userAge == 16 || userAge == 17) {
//        println("Show limited content")
//    }
//    else {
//        println("Back to main screen")
//    }
    // без фигурных скобок
//    if (userAge >= AGE_OF_MAJORITY)
//        println("Show special content")
//    else if (userAge == 16 || userAge == 17)
//        println("Show limited content")
//    else
//        println("Back to main screen")

    // без фигурных скобок и ещё короче
//    if (userAge >= AGE_OF_MAJORITY) println("Show special content")
//    else if (userAge == 16 || userAge == 17) println("Show limited content")
//    else println("Back to main screen")

    //другой тип решения задачи
//    val resultText = if (userAge >= AGE_OF_MAJORITY) {
//        "Show special content"
//    } else if (userAge == 16 || userAge == 17) {
//        "Show limited content"
//    }
//    else {
//        "Back to main screen"
//    }
//    println(resultText)

//    when(userAge) {
//        10 -> println("Your number is 10")
//        20 -> println("Your number is 20")
//        42 -> println("Your number is 42")
//        else -> println("Another number")
//    }

//    val consoleNumber = when(userAge) {
//        10 -> "Your number is 10"
//        20 -> "Your number is 20"
//        42 -> "Your number is 42"
//        else -> "Another number"
//    }
//    println(consoleNumber) // в этом случае мы показываем факт вызова строки, а не саму строку

    val consoleNumber = when(userAge) {
        10 -> {
            println("Additional action")
            "Your number is 10"
        }
        20 -> "Your number is 20"
        42 -> "Your number is 42"
        else -> "Another number"
    }
    println(consoleNumber)
}