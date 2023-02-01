import java.util.*
import kotlin.collections.HashSet

object Ex0604 {
    var scan: Scanner = Scanner(System.`in`)
    fun launch() {
        val set = OnlineSet()
        val n: Int = scan.nextInt()
        for (i in 0 until n) {
            val operation: String = scan.next()
            when (operation) {
                "+" -> {
                    val addNum: Int = scan.nextInt()
                    set.add(addNum)
                }

                "-" -> {
                    val removeNum: Int = scan.nextInt()
                    set.remove(removeNum)
                }

                "?" -> {
                    val queryNum: Int = scan.nextInt()
                    if (set.contains(queryNum)) {
                        println("Found")
                    } else {
                        println("Not found")
                    }
                }

                "s" -> {
                    val l: Int = scan.nextInt()
                    val r: Int = scan.nextInt()
                    println(set.sum(l, r))
                }

                else -> println("Invalid operation")
            }
        }
    }

    class OnlineSet {
        private val set: HashSet<Int>
        private var lastSum: Long

        init {
            set = HashSet()
            lastSum = 0
        }

        fun add(i: Int) {
            val f = ((i + lastSum) % 1000000001).toInt()
            set.add(f)
        }

        operator fun contains(i: Int): Boolean {
            val f = ((i + lastSum) % 1000000001).toInt()
            return set.contains(f)
        }

        fun remove(i: Int) {
            val f = ((i + lastSum) % 1000000001).toInt()
            set.remove(f)
        }

        fun sum(l: Int, r: Int): Long {
            val f_l = ((l + lastSum) % 1000000001).toInt()
            val f_r = ((r + lastSum) % 1000000001).toInt()
            var sum: Long = 0
            for (i in f_l..f_r) {
                if (set.contains(i)) {
                    sum += i.toLong()
                }
            }
            lastSum += sum
            return sum
        }
    }
}