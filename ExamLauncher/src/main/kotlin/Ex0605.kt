import java.util.*

object Ex0605 {
    var scanner = Scanner(System.`in`)
    fun launch() {
        println("Enter text:")
        val text = scanner.nextLine()
        println("Enter args count:")
        val argsCount = scanner.nextInt()
        scanner.nextLine() // баг, для правильного чтения
        val rope = Rope(text, argsCount)
        for (i in 0 until argsCount) {
            val arg = scanner.nextLine()
            val from = arg.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[0].toInt()
            val until = arg.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[1].toInt()
            val instead = arg.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()[2].toInt()
            val res = rope.ropeText(from, until, instead)
            println(res)
        }
    }

    class Rope(var text: String, var argsCount: Int) {
        fun ropeText(from: Int, until: Int, instead: Int): String {
            val tmp = StringBuilder()
            for (i in from..until) {
                tmp.append(text[i])
            }
            text = text.replaceFirst(tmp.toString().toRegex(), "") // Удалили то, что
            // получили с
            // исходной строки
            val textSB = StringBuilder(text)
            textSB.insert(instead, tmp) // instead - куда вставить, tmp - что
            // вставить
            text = textSB.toString()
            return text
        }
    }
}