import java.util.*

object Ex0202 {
    var scanner = Scanner(System.`in`)
    fun heightCounter(tree: IntArray, index: Int): Int {
        val pValue = tree[index]
        return if (pValue == -1) {
            1
        } else 1 + heightCounter(tree, pValue)
    }

    fun launch() {
        val length = scanner.nextInt()
        val tree = IntArray(length)
        for (index in 0 until length) {
            tree[index] = scanner.nextInt()
        }
        var height = 1
        for (index in tree.indices) {
            height = Math.max(height, heightCounter(tree, index))
        }
        println(height)
    }
}