import org.jrubyparser.CompatVersion
import org.jrubyparser.Parser
import org.jrubyparser.ast.*
import org.jrubyparser.parser.ParserConfiguration
import java.io.File
import java.io.StringReader
import kotlin.math.ln
import kotlin.math.pow

class HolstedMetrics {
    private var unique_operators_n1 = 0 // Количество уникальных операторов
    private var unique_operands_n2 = 0 // Количество уникальных операндов
    private var all_operators_N1 = 0 // Общее количество операторов
    private var all_operands_N2 = 0 // Общее количество операндов

    private var operands = ArrayList<Node>()
    private var operators = ArrayList<Node>()

    private fun getNodeName(node: Node): String {
        val name = node.javaClass.name
        val i = name.lastIndexOf(46.toChar())
        return name.substring(i + 1)
    }

    private fun run(node: Node) {
        println(getNodeName(node))
        if (node.isLeaf) {
            operands.add(node)
        } else {
            operators.add(node)
        }
        for (child in node.childNodes()) {
            run(child as Node)
        }
    }

    fun calculateMetrics(codee: String) {
        val parser = Parser()
        val `in` = StringReader(codee)
        val version: CompatVersion = CompatVersion.RUBY1_8
        val config = ParserConfiguration(0, version)
        val ast = parser.parse("<code>", `in`, config)
        run(ast)

        all_operators_N1 = operators.size
        all_operands_N2 = operands.size

        val soperands = HashSet<Node>()
        val soperators = HashSet<Node>()

        for (o in operands) {
            soperands.add(o)
        }

        for (o in operators) {
            soperators.add(o)
        }
        unique_operators_n1 = soperators.size
        unique_operands_n2 = soperands.size


        val vocabulary = unique_operators_n1 + unique_operands_n2
        val length = all_operators_N1 + all_operands_N2
        val volume = length * ln(vocabulary.toDouble())
        println("Number of unique operators (n1): $unique_operators_n1")
        println("Number of unique operands (n2): $unique_operands_n2")
        println("Total number of operators (N1): $all_operators_N1")
        println("Total number of operands (N2): $all_operands_N2")
        println("Program vocabulary: $vocabulary")
        println("Program length: $length")
        println("Program volume: $volume")
    }
}

fun main() {
    val filename = "lang.rb"
    val code = File(filename).readText()
    val holstedMetrics = HolstedMetrics()
    holstedMetrics.calculateMetrics(code)
}