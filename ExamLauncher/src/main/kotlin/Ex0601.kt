import java.util.*

object Ex0601 {
    lateinit var nodes: Array<Node?>
    var inOrder = StringBuilder()
    var preOrder = StringBuilder()
    var postOrder = StringBuilder()
    var scanner = Scanner(System.`in`)
    fun launch() {
        val vertexCount = scanner.nextInt()
        nodes = arrayOfNulls(vertexCount)
        for (i in 0 until vertexCount) {
            nodes[i] = Node(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())
        }
        walk(0)
        println(inOrder.toString())
        println(preOrder.toString())
        println(postOrder.toString())
    }

    fun walk(index: Int) {
        if (index == -1) {
            return
        }
        preOrder.append(nodes[index]!!.value)
        preOrder.append(" ")
        walk(nodes[index]!!.left)
        inOrder.append(nodes[index]!!.value)
        inOrder.append(" ")
        walk(nodes[index]!!.right)
        postOrder.append(nodes[index]!!.value)
        postOrder.append(" ")
    }

    class Node(var value: Int, var left: Int, var right: Int)
}