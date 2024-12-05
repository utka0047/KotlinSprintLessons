fun main() {
    val userLogin = "Zaphod"
    val userPassword = "PanGalactic"
    println("введите логин:")
    val login = readln()

    if (login == userLogin) {
        println("введите пароль:")
        val password = readln()

        if (password == userPassword) {
            println("добро пожаловать")
        } else {
            println("неверный пароль. попробуйте снова")
        }

    } else {
        println("пассажир не найден. зарегистрируйтесь прямо сейчас!")
    }
}
