package org.example.Lesson2

fun main() {

    val a = 5
    val b = 7
    val sum = a+b
    val c1 = 888 // автоматически
    val c2: Int // принудительно

//    println(sum)
//    println(10 / 3) // ответ = 3, Int-число


    val intNum1: Int = 10
    val intNum2:Int = 3
    println(intNum1 / intNum2)

    val floatNum1: Float = 10.0f
    val floatNum2: Float = 3.0f
    println(floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    println(doubleNum1 / doubleNum2)

    val complexExpression = (a + b) * 2 - 4 / 2
    println(complexExpression)

    // остаток от деления %
    println(10 % 3)
    println(10 % 2)

//    val f = intNum1 + floatNum1
//    println(f) // float
//
//    val f1 = intNum1 + floatNum1 + doubleNum1
//    println(f1) // double

    // вывод типа переменной

    val f = intNum1 + floatNum1
    println(f::class.java.simpleName) // float

    val f1 = intNum1 + floatNum1 + doubleNum1
    println(f1::class.java.simpleName) // double

    // инкремент, декремент
    var counter = 0

    counter = counter + 1
    counter += 1
    counter++

    println(counter)

    counter -= 1
    counter--

    // операторы сравнения
    // a = 5, b = 7
    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b)

}