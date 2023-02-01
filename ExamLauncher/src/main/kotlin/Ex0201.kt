import java.util.*

object Ex0201 {
    var `in` = Scanner(System.`in`)
    fun launch() {
        val bracket: CharArray = `in`.next().toCharArray()
        val stack = LinkedList<Char>()
        val n = bracket.size
        var unclosedBracket = 0
        for (i in 0 until n) {
            if (bracket[i] == '{' || bracket[i] == '(' || bracket[i] == '[') {
                if (stack.isEmpty()) {
                    unclosedBracket = i + 1
                }
                stack.push(bracket[i])
            } else if (bracket[i] == '}' || bracket[i] == ')' || bracket[i] == ']') {
                if (!Objects.equals(stack.peek(), reverseBracket(bracket[i]))) {
                    println(i + 1)
                    return
                }
                stack.pop()
            }
        }
        if (stack.isEmpty()) {
            println("Success")
        } else {
            println(unclosedBracket)
        }
    }

    fun reverseBracket(c: Char): Char {
        return when (c) {
            '}' -> '{'
            ']' -> '['
            ')' -> '('
            else -> '-'
        }
    }
}