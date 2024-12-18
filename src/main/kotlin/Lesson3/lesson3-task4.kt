package Lesson3
/*
В приложении шахматы, ходы отправляются на сервер в виде строки формата [откуда-куда;номер хода].
Игрок начал партию ходом из E2 в E4. Все данные (откуда, куда, номер хода) инициализировать и хранить в отдельных переменных.
– Напиши код, который сформирует строку для отправки, а затем выведет ее в консоль.
Нужно "собрать" единую строку из объявленных переменных и сохранить в новую переменную (или сразу распечатывать).
– Далее этим переменным нужно присвоить новые данные и вывести в консоль следующий ход белых.
Определить, какое значение будет в переменной "куда" для фигуры, стоящей на D2 и продвинувшейся на одну клетку вперед.
 */

fun main() {

    var beginning = "E2"
    var end = "E4"
    var number = 1
    var message = "[$beginning-$end;$number]"
    println(message)

    beginning = "D2"
    end = "D${2+1}"
    number = number + 1
    message = "[$beginning-$end;$number]"
    println(message)



}