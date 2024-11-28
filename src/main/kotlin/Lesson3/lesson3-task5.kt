package Lesson3

/*
Продолжаем работать над приложением “Шахматы”. Напиши программу для сервера, которая примет строку, отправленную игроком
(считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.
Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих: откуда, куда и номер хода,
присвоить соответствующим переменным и распечатать по отдельности.
 */

fun main() {

    val moveData = "D2-D4;0"

    val parts = moveData.split(";")
    val move = parts[0]
    val moveNumber = parts[1].toInt()

    val moveParts = move.split("-")
    val beginning = moveParts[0]
    val end = moveParts[1]

    println(beginning)
    println(end)
    println(moveNumber)

}