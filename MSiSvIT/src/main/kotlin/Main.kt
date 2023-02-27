import antlr.RubyLexer
import antlr.RubyParser
import antlr.RubyParserBaseListener
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.ParseTreeWalker
import java.io.File
import kotlin.math.ln


class HolstedMetrics : RubyParserBaseListener() {
    private val operators = mutableMapOf<String, Int>()
    private val operands = mutableMapOf<String, Int>()
    private var n1 = 0
    private var n2 = 0
    private var N1 = 0
    private var N2 = 0
    private var N = 0

    override fun enterEveryRule(ctx: ParserRuleContext) {
        val ruleName = RubyParser.ruleNames[ctx.ruleIndex]
        val text = ctx.text
        println("Rule name: $ruleName, Text: $text")
        when (ruleName) {
            "logicalOperator",
            "equalsOperator",
            "compareOperator",
            "bitOperator",
            "mathOperator",
            "assignOperator",
            "terms",
            "dot_ref",
            "do_keyword",
            "else_tail",
            "if_tail",
            "then_keyword",
            "undef_statement",
            "when_cond",
            "not",
            -> {
                operators[text] = operators.getOrDefault(text, 0) + 1
                N1++
            }

            "literal",
            "string",
            "identifier",
            -> {
                operands[text] = operands.getOrDefault(text, 0) + 1
                N2++
            }
        }
        N++
    }

    fun calculateHolstedMetrics(code: String) {
        val lexer = RubyLexer(CharStreams.fromString(code))
        val tokens = CommonTokenStream(lexer)
        val parser = RubyParser(tokens)
        parser.removeErrorListeners()
        var tree: RubyParser.ExprContext?
        while (true) {
            try {
                tree = parser.expr()
                if (tree != null && tree.text == "\r") {
                    continue
                }
                if (tree == null || tree.text == "HUMMEL_EOF") {
                    break
                }
                ParseTreeWalker.DEFAULT.walk(this, tree)
            } catch (_: Exception) {
            }
        }

        n1 = operators.size
        n2 = operands.size

        val vocabularySize = n1 + n2
        val programLength = N1 + N2
        val programVolume = programLength * ln(vocabularySize.toDouble())

        println("Number of unique operators (n1): $n1")
        println("Number of unique operands (n2): $n2")

        println("Total number of operators (N1): $N1")
        println("Total number of operands (N2): $N2")

        println("Vocabulary size (n): $vocabularySize")
        println("Program length (N): $programLength")
        println("Program volume (V): $programVolume")
    }
}

fun main() {
    val code = File("C:\\Users\\Hummel009\\Documents\\simple.rb").readText()
    val holstedMetrics = HolstedMetrics()
    holstedMetrics.calculateHolstedMetrics(code)
}