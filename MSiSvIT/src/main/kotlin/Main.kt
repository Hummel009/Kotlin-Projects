import antlr.CorundumBaseListener
import antlr.CorundumLexer
import antlr.CorundumParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.Token.EOF
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File
import kotlin.math.ln

class HolstedMetrics : CorundumBaseListener() {
    private val operators = mutableMapOf<String, Int>()
    private val operands = mutableMapOf<String, Int>()
    private var n1 = 0
    private var n2 = 0
    private var N1 = 0
    private var N2 = 0
    private var N = 0

    override fun enterEveryRule(ctx: ParserRuleContext) {
        val ruleName = CorundumParser.ruleNames[ctx.ruleIndex]
        val text = ctx.text
        when (ruleName) {
            "operator_expression" -> {
                operators[text] = operators.getOrDefault(text, 0) + 1
                N1++
            }
            "operand_expression" -> {
                operands[text] = operands.getOrDefault(text, 0) + 1
                N2++
            }
        }
        N++
    }

    fun calculateHolstedMetrics(code: String) {
        val lexer = CorundumLexer(CharStreams.fromString(code))
        val tokens = CommonTokenStream(lexer)
        val parser = CorundumParser(tokens)
        var tree: CorundumParser.ExpressionContext?
        while (true) {
            try {
                tree = parser.expression()
                if (tree == null || tree.text == "<EOF>") {
                    break
                }
                ParseTreeWalker.DEFAULT.walk(this, tree)
                println("Going: ${tree.text}")
            } catch (_: Exception) {
            }
        }

        n1 = operators.size
        n2 = operands.size

        val vocabularySize = n1 + n2
        val programLength = N1 + N2
        val programVolume = programLength * ln(vocabularySize.toDouble())
        val programDifficulty = (n1 / 2.0) * (N2 / n2.toDouble())
        val programEffort = programVolume * programDifficulty
        val programTime = programEffort / 18
        val programBugs = programVolume / 3000

        println("Number of unique operators (n1): $n1")
        println("Number of unique operands (n2): $n2")
        println("Total number of operators (N1): $N1")
        println("Total number of operands (N2): $N2")
        println("Total number of lines of code (N): $N")
        println("Vocabulary size (n): $vocabularySize")
        println("Program length (N): $programLength")
        println("Program volume (V): $programVolume")
        println("Program difficulty (D): $programDifficulty")
        println("Program effort (E): $programEffort")
        println("Programming time (T): $programTime")
        println("Number of delivered bugs (B): $programBugs")
    }
}

fun main() {
    val code = File("C:\\Users\\Hummel009\\Documents\\example.rb").readText()
    val holstedMetrics = HolstedMetrics()
    holstedMetrics.calculateHolstedMetrics(code)
}