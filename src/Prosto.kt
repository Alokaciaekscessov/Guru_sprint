import java.io.File
fun main() {
    var text = mutableListOf<String>()

    while (true) {
        println(
            """
            |==== МЕНЮ ====
            |1. Написать текст
            |2. Показать текст
            |3. Сохранить в файл
            |4. Загрузить из файла
            |5. Выход
            """.trimMargin()
        )

        when (readln()) {
            "1" -> {
                println("Пиши строки (введи 'exit' чтобы закончить):")
                while (true) {
                    val line = readln()
                    if (line.lowercase() == "exit") break
                    text.add(line)
                }
            }

            "2" -> {
                println("\n=== ТВОЙ ТЕКСТ ===")
                if (text.isEmpty()) {
                    println("Тут пусто. Как в голове перед дедлайном.")
                } else {
                    text.forEach { println(it) }
                }
            }

            "3" -> {
                println("Имя файла:")
                val filename = readln()
                File(filename).writeText(text.joinToString("\n"))
                println("Сохранено, можешь не плакать 👍")
            }

            "4" -> {
                println("Имя файла:")
                val filename = readln()
                val file = File(filename)

                if (file.exists()) {
                    text = file.readLines().toMutableList()
                    println("Загружено. Магия, блин.")
                } else {
                    println("Файла нет. Как и твоих шансов угадать имя 😏")
                }
            }

            "5" -> {
                println("Выход. Программа выжила, поздравляю.")
                break
            }

            else -> println("Ты что-то странное ввёл, попробуй ещё раз 🤨")
        }
    }
}