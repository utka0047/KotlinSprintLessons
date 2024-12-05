fun main() {

    println("Введите свой вес (в кг)")
    val userWeight = readln().toDouble()

    println("Введите свой рост (в см)")
    val userHeight = (readln().toFloat()) / 100

    val index = userWeight / (userHeight * userHeight)

    val category = when {
        index < 18.5 -> "Недостаточная масса тела"
        index < 25 -> "Нормальная масса тела"
        index < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ равен ${String.format("%.2f", index)}, ваша категория - $category")

}