import java.util.*

object Ex0402 {
    var scanner = Scanner(System.`in`)
    fun launch() {
        val maxNumber = scanner.nextInt()
        val numberOfEqualities = scanner.nextInt()
        val numberOfInequalities = scanner.nextInt()
        val set = Set(maxNumber)
        var result = 1
        for (i in 0 until numberOfEqualities) {
            set.union(scanner.nextInt() - 1, scanner.nextInt() - 1)
        }
        for (i in 0 until numberOfInequalities) {
            if (set.check(scanner.nextInt() - 1, scanner.nextInt() - 1)) {
                result = 0
                break
            }
        }
        println(result)
    }

    class Set(size: Int) {
        var setArray: IntArray

        init {
            setArray = IntArray(size)
            for (i in 0 until size) {
                setArray[i] = i
            }
        }

        fun check(left: Int, right: Int): Boolean {
            return setArray[find(left)] == setArray[find(right)]
        }

        fun find(i: Int): Int {
            if (i != setArray[i]) {
                setArray[i] = find(setArray[i])
            }
            return setArray[i]
        }

        fun union(destination: Int, source: Int) {
            val destinationID = find(destination)
            val sourceID = find(source)
            setArray[sourceID] = destinationID
        }
    }
}