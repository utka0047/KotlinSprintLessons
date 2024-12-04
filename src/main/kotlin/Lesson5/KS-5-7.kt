fun main() {
    println("Введите расстояние поездки (в км)")
    val userDistance = readln().toFloat()
    println("Введите расход топлива на 100 км (в литрах)")
    val userExpenseGas = readln().toFloat()
    println("Введите цену за литр топлива")
    val userGasPrice = readln().toFloat()

    val allGas = (userDistance * userExpenseGas) / 100
    val value = allGas * userGasPrice

    println("Для поездки необходимо ${String.format("%.2f", allGas)} литров топлива, общая стоимость поездки - ${String.format("%.2f", value)}")
}