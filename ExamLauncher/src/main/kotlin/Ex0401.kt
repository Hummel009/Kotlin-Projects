import java.util.*

object Ex0401 {
    var scanner: Scanner = Scanner(System.`in`)
    fun launch() {
        val tablesCount: Int = scanner.nextInt()
        val requestsCount: Int = scanner.nextInt()
        val set = Set(tablesCount)
        for (i in 0 until tablesCount) {
            set.initSet(scanner.nextInt(), i)
        }
        for (i in 0 until requestsCount) {
            set.union(scanner.nextInt() - 1, scanner.nextInt() - 1)
            println(set.maxRank)
        }
    }

    class Set(tablesCount: Int) {
        var rank: IntArray
        var setArray: IntArray
        var maxRank = 0

        init {
            setArray = IntArray(tablesCount)
            rank = IntArray(tablesCount)
        }

        fun find(i: Int): Int {
            if (i != setArray[i]) {
                setArray[i] = find(setArray[i])
            }
            return setArray[i]
        }

        fun initSet(entryCount: Int, position: Int) {
            setArray[position] = position
            rank[position] = entryCount
            maxRank = if (entryCount > maxRank) entryCount else maxRank
        }

        fun union(destination: Int, source: Int) {
            val destinationID = find(destination)
            val sourceID = find(source)
            if (destinationID == sourceID) {
                return
            }
            setArray[sourceID] = destinationID
            rank[destinationID] += rank[sourceID]
            maxRank = if (rank[destinationID] > maxRank) rank[destinationID] else maxRank
        }
    }
}