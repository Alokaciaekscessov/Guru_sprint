fun main() {
    // Задача 11
    var counter = 5

    while (counter > 0) {
        println(counter)
        counter--
    }

    println("Реклама закончилась!")

    // Задача 12
    val secret = "1234"
    var input: String

    do {
        print("Введите пароль: ")
        input = readLine() ?: ""
    }
    while (input != secret)
    println("Доступ разрешён")
}