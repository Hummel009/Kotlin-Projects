import java.util.*
import kotlin.collections.ArrayDeque

object Ex0203 {
    var time = 0
    var bufferSize = 0
    var buffer: ArrayDeque<Package>? = null
    var scanner: Scanner = Scanner(System.`in`)
    fun launch() {
        bufferSize = scanner.nextInt()
        buffer = ArrayDeque(bufferSize)
        val packageCount: Int = scanner.nextInt()
        if (packageCount == 0) {
            println("")
        } else if (packageCount == 1) {
            System.out.println(scanner.nextInt())
        } else {
            for (i in 0 until packageCount) {
                process(Package(scanner.nextInt(), scanner.nextInt()))
            }
            scanner.close()
        }
    }

    fun process(pack: Package) {
        if (buffer!!.size < bufferSize) {
            println(Math.max(time, pack.average))
            if (pack.average >= time) {
                time = pack.endTime
            } else {
                time += pack.duration
            }
            pack.end = time
            buffer!!.add(pack)
        } else if (pack.average >= buffer!!.first().end) {
            println(Math.max(time, pack.average))
            if (time > buffer!!.last().end) {
                time += pack.duration
            } else {
                time = buffer!!.last().end + pack.duration
            }
            buffer!!.removeFirst()
            pack.end = time
            buffer!!.add(pack)
        } else {
            println("-1")
        }
    }

    class Package(var average: Int, var duration: Int) {
        var end = 0

        val endTime: Int
            get() = average + duration
    }
}