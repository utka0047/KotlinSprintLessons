package Lesson5



fun main() {

    val userLogin = "Zaphod"
    val userPassword = "PanGalactic"

    println("Введите логин и пароль")
    val login = readln()
    val password = readln()

    if (userLogin == login && userPassword == password) {
        println("Добро пожаловать")
    }
    else {
        println("Пассажир не найден. Зарегистрируйтесь прямо сейчас!")
    }


}