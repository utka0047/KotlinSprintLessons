package Lesson4

class lesson4 {
}

fun main() {

    // логические операторы
    // операторы сравнения
    val a = 1 + 1
    val b = (1 == 1)

    // <, >, >=. <=, ==, !=, ===, !==
    // true, false
    // &&, ||, !


    val userAge = 42
    val compressionResult: Boolean = userAge >= AGE_OF_MAJORITY
    println("Result is: $compressionResult") // true

    val userAge1 = 15
    val compressionResult1: Boolean = userAge1 >= AGE_OF_MAJORITY
    println("Result is: $compressionResult1") // false


    println(0 < -1)
    println(1 == 1)
    println(2 == 3)
    println(7 != 8)


    val userAge2 = 15
    val compressionResult2: Boolean = (userAge2 >= AGE_OF_MAJORITY) && (userAge <= RETIREMENT_AGE)
    println("Result is: $compressionResult2") // false


    val userAge3 = 15
    val compressionResult3: Boolean = (userAge3 >= AGE_OF_MAJORITY) || (userAge3 <= RETIREMENT_AGE)
    println("Result is: $compressionResult3") // true

    val x = true
    val y = !x
    println(y) // false


    val userAge5 = 15
    val compressionResult5: Boolean = (userAge5 >= AGE_OF_MAJORITY) && !(userAge5 >= RETIREMENT_AGE)
    println("Result is: $compressionResult5") // false


    val userAge4 = 15
    val compressionResult4: Boolean = (userAge4 >= AGE_OF_MAJORITY) && !(userAge4 >= RETIREMENT_AGE)
    val result5 = userAge5 in AGE_OF_MAJORITY..RETIREMENT_AGE // рассказать зачем это и как это работает
    println("Result is: $compressionResult4") // false
}

const val AGE_OF_MAJORITY = 18 // объяснить зачем нужна именно константа
const val RETIREMENT_AGE = 65