import kotlin.math.ln

var operators = mutableMapOf(
    "puts" to 0,
    "[" to 0,
    "]" to 0,
    "." to 0,
    " " to 0,
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
    "break" to 0,
    "gets" to 0
)

var operands = mutableMapOf<String, Int>()
var ignore = "do \n else elsif when in () ]"


fun main() {
    val code = "def gcd(a, b)\r\n while b != 0\r\n temp = b\r\n b = a % b\r\n a = temp\r\n end\r\n return a\r\nend".replace("\r", "")
    getInfo(code)
}

fun getInfo(code: String) {
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
            operators[prevToken] = operators.getOrDefault(prevToken, 0) + 1
            currToken = symbol.toString()
            if (prevToken != ".") {
                dot = false
            }
        } else if (operators.containsKey(symbol.toString())) {
            if (dot || symbol == '(') {
                if (symbol == '(') {
                    operators["("] = operators.getOrDefault("(", 0) + 1
                }
                operators[prevToken] = operators.getOrDefault(prevToken, 0) + 1
            } else {
                operands[prevToken] = operands.getOrDefault(prevToken, 0) + 1
            }
            currToken = symbol.toString()
            dot = false
        }

    }

    if (operators.containsKey(currToken)) {
        operators[currToken] = operators[currToken]!! + 1
    } else if (dot) {
        operators[currToken] = operators.getOrDefault(currToken, 0) + 1
    } else {
        operands[currToken] = operands.getOrDefault(currToken, 0) + 1
    }

    if (operands.containsKey("ped")) {
        operands["swapped"] = operands.getOrDefault("swapped", 0) + operands["ped"]!!
        operators["swap"] = operators.getOrDefault("swap", 0) - operands["ped"]!!
        operands.remove("ped")
    }

    println("Operators:")
    var allOperators = 0
    var numOperators = 1

    operators.entries.iterator().let { iterator ->
        while (iterator.hasNext()) {
            val (key, value) = iterator.next()
            if (value == 0 || (key != "if" && key in ignore)) {
                iterator.remove()
                continue
            }
            println("${numOperators++}) \"$key\": $value times")
            allOperators += value
        }
    }
    println("The sum of operators: $allOperators\n")

    operands.remove("in")
    println("Operands:")
    var allOperands = 0
    var numOperands = 1
    for ((key, value) in operands) {
        println("${numOperands++}) \"$key\": $value times")
        allOperands += value
    }
    println("The sum of operands: $allOperands\n")

    val num = numOperands - 1 + numOperators - 1
    val all = allOperands + allOperators
    println("Dictionary: $num")
    println("Program length: $all")
    println("Program volume: ${all + ln(num.toDouble()).toInt()}")
}