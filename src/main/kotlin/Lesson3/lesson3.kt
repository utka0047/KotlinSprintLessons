package Lesson3

fun main() {

    val greeting = "Hello"
    val space = ' '
    val userName = "Star Lord"

    // конкатенация строк
    println(greeting + ", " + userName + "!" + space + "What is yore main question?")

    //интерполяция строк
    println("$greeting, $userName! What is your main question?")
    println("To switch you can respond ${40+2}")

    val multiString = """
        oilkjs
                weoidjo
           wssd
    """.trimIndent()
    println(multiString)

    val multiString2 = """
        |oilkjs
                |weoidjo
           |wssd
    """.trimMargin()
    println(multiString2)

    val phrase = "And he said - \"it is magnificent!\""
    println(phrase)

}