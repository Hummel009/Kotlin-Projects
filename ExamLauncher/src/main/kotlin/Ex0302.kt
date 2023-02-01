import java.util.*

object Ex0302 {
    var scanner = Scanner(System.`in`)
    fun launch() {
        val amogus = scanner.nextInt()
        val heap = Heap(amogus)
        val processesCount = scanner.nextInt()
        for (i in 0 until processesCount) {
            val firstFree = heap.firstFree
            println(String.format("%s %s", firstFree!!.number, firstFree.time))
            val newTime = scanner.nextLong()
            if (newTime != 0L) {
                heap.changeTime(newTime)
            }
        }
    }

    class Heap(var size: Int) {
        var processors: Array<Processor?> = arrayOfNulls(size)

        init {
            for (i in 0 until size) {
                processors[i] = Processor(i, 0)
            }
        }

        fun changeTime(newTime: Long) {
            processors[0]!!.time += newTime
            siftDown(0)
        }

        val firstFree: Processor?
            get() = processors[0]

        fun siftDown(index: Int) {
            var index = index
            var smallestIndex: Int
            val top = processors[index]
            while (index < size / 2) {
                val leftChildIndex = 2 * index + 1
                val rightChildIndex = leftChildIndex + 1
                smallestIndex = if (rightChildIndex >= size) {
                    if (processors[leftChildIndex]!!.time > processors[index]!!.time) index else leftChildIndex
                } else if (processors[leftChildIndex]!!.time > processors[rightChildIndex]!!.time) {
                    rightChildIndex
                } else if (processors[leftChildIndex]!!.time == processors[rightChildIndex]!!.time) {
                    if (processors[leftChildIndex]!!.number > processors[rightChildIndex]!!.number) rightChildIndex else leftChildIndex
                } else {
                    leftChildIndex
                }
                if (top!!.time < processors[smallestIndex]!!.time || top.time == processors[smallestIndex]!!.time && top.number <= processors[smallestIndex]!!.number) {
                    break
                }
                processors[index] = processors[smallestIndex]
                index = smallestIndex
                processors[index] = top
            }
        }
    }

    class Processor(var number: Int, var time: Long)
}