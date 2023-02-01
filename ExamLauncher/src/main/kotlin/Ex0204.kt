import java.io.BufferedReader
import java.io.IOException
import java.io.Reader
import java.util.*

object Ex0204 {
    var scanner = Scanner(System.`in`)
    fun launch() {
        val operationCount = scanner.nextInt()
        val operationStack: Deque<Int> = ArrayDeque(operationCount)
        val maxStack: Deque<Int> = ArrayDeque(operationCount)
        for (i in 0 until operationCount) {
            var operation: String? = null
            operation = scanner.next()
            if (operation.startsWith("push")) {
                var value = 0
                value = scanner.nextInt()
                operationStack.push(value)
                maxStack.push(Math.max(if (maxStack.isEmpty()) 0 else maxStack.peek(), value))
            } else if (operation.startsWith("pop")) {
                operationStack.pop()
                maxStack.pop()
            } else {
                println(if (maxStack.isEmpty()) 0 else maxStack.peek())
            }
        }
    }

    class MyReader(r: Reader?) {
        var reader: BufferedReader
        var tokenizer: StringTokenizer? = null

        init {
            reader = BufferedReader(r)
        }

        @Throws(IOException::class)
        operator fun next(): String {
            while (tokenizer == null || !tokenizer!!.hasMoreTokens()) {
                tokenizer = StringTokenizer(reader.readLine())
            }
            return tokenizer!!.nextToken()
        }

        @Throws(IOException::class)
        fun nextInt(): Int {
            return next().toInt()
        }
    }
}