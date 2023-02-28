import kotlin.math.ln

fun main() {
    val code = "def gcd(a, b)\r\n while b != 0\r\n temp = b\r\n b = a % b\r\n a = temp\r\n end\r\n return a\r\nend"
    val session = Parser()
    println(session.getInfo(code))
}

class Parser {
    private var operators = mutableMapOf(
        "puts" to 0,
        "[" to 0,
        "]" to 0,
        "." to 0,
        " " to 0,
        "\r" to 0,
        "\n" to 0,
        "\"" to 0,
        "+" to 0,
        "-" to 0,
        "*" to 0,
        "=" to 0,
        "/" to 0,
        "," to 0,
        "(" to 0,
        ")" to 0,
        "for" to 0,
        "loop" to 0,
        "while" to 0,
        "do" to 0,
        "else" to 0,
        "elsif" to 0,
        "==" to 0,
        ">" to 0,
        "<" to 0,
        ">=" to 0,
        "<=" to 0,
        "end" to 0,
        "begin" to 0,
        "case" to 0,
        "when" to 0,
        "gets" to 0,
        "!" to 0,
        "%" to 0,
        "return" to 0,
        "break" to 0,
        "def" to 0,
        "if" to 0,
        ".." to 0,
        "break" to 0
    )

    private var operands = mutableMapOf<String, Int>()
    private var ignore = "do \r \n else elsif when in () ]"

    fun getInfo(code: String): String {
        var prevToken: String
        var currToken = ""
        var dot = false

        for (symbol in code) {
            prevToken = currToken
            currToken += symbol

            if (operators.containsKey(currToken)) {
                continue
            } else if (operators.containsKey(prevToken)) {
                if (prevToken == ".") {
                    dot = true
                }
                operators[prevToken] = (operators[prevToken] ?: 0) + 1

                currToken = symbol.toString()
                if (prevToken != ".") {
                    dot = false
                }
            } else if (operators.containsKey(symbol.toString())) {
                if (dot || symbol == '(') {
                    if (symbol == '(') {
                        operators["("] = (operators["("] ?: 0) + 1
                    }
                    operators[prevToken] = (operators[prevToken] ?: 0) + 1
                } else {
                    operands[prevToken] = (operands[prevToken] ?: 0) + 1
                }
                currToken = symbol.toString()
                dot = false
            }

        }

        if (operators.containsKey(currToken)) {
            operators[currToken] = (operators[currToken] ?: 0) + 1
        } else if (dot) {
            operators[currToken] = (operators[currToken] ?: 0) + 1
        } else {
            operands[currToken] = (operands[currToken] ?: 0) + 1
        }

        if (operands.containsKey("ped")) {
            operands["swapped"] = (operands["swapped"] ?: 0) + (operands["ped"] ?: 0)
            operators["swap"] = (operators["swap"] ?: 0) + 1 - (operands["ped"] ?: 0)

            operands.remove("ped")
        }

        val sb = StringBuilder()

        sb.append("Operators:\n")
        var allOperators = 0
        var numOperators = 1

        operators.entries.iterator().let { iterator ->
            while (iterator.hasNext()) {
                val (key, value) = iterator.next()
                if (value == 0 || (key != "if" && key in ignore)) {
                    iterator.remove()
                    continue
                }
                sb.append("${numOperators++}) \"$key\": $value times\n")
                allOperators += value
            }
        }
        sb.append("The sum of operators: $allOperators\n\n")

        operands.remove("in")
        sb.append("Operands:\n")
        var allOperands = 0
        var numOperands = 1
        for ((key, value) in operands) {
            sb.append("${numOperands++}) \"$key\": $value times\n")
            allOperands += value
        }
        sb.append("The sum of operands: $allOperands\n\n")

        val num = numOperands - 1 + numOperators - 1
        val all = allOperands + allOperators
        sb.append("Dictionary: $num\n")
        sb.append("Program length: $all\n")
        sb.append("Program volume: ${all + ln(num.toDouble()).toInt()}\n")

        return sb.toString()
    }
}
