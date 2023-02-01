import java.io.BufferedWriter
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.*


object Ex0503 {
    var scanner: Scanner = Scanner(System.`in`)
    var DIVIDER: Short = 10007
    var BASE: Short = 47
    var STEPS: Short = 6
    var subStringHashCode = 0
    var patternLength = 0
    lateinit var powers: IntArray
    fun fillPowers() {
        powers = IntArray(patternLength + 1)
        powers[0] = 1
        powers[1] = BASE.toInt()
        if (patternLength >= 3) {
            for (power in 2..patternLength - 1) {
                powers[power] = powers[power - 1] * BASE % DIVIDER
            }
        }
    }

    fun hashCode(pattern: CharArray): Int {
        var hashCode = 0
        var power = 0
        for (ch in pattern) {
            hashCode = ((hashCode + ch.code * powers[power]) % DIVIDER + DIVIDER) % DIVIDER
            power++
        }
        return hashCode
    }

    fun hashCode(text: CharArray, i: Int): Int {
        var hashCode = 0
        if (i != text.size - patternLength) {
            hashCode =
                (subStringHashCode - text[i + patternLength].code * powers[patternLength - 1] % DIVIDER + DIVIDER) % DIVIDER
            hashCode = (hashCode * BASE + text[i].code) % DIVIDER
        } else {
            var power = 0
            var pos = i
            while (pos < i + patternLength) {
                hashCode = (hashCode + text[pos].code * powers[power] % DIVIDER) % DIVIDER
                pos++
                power++
            }
        }
        return hashCode
    }

    fun launch() {
        val pattern: CharArray = scanner.next().toCharArray()
        val text: CharArray = scanner.next().toCharArray()
        patternLength = pattern.size
        fillPowers()
        val patternHashCode = hashCode(pattern)
        val matches = LinkedList<Int>()
        val writer = BufferedWriter(OutputStreamWriter(System.out))
        for (i in text.size - pattern.size downTo 0) {
            subStringHashCode = hashCode(text, i)
            if (patternHashCode == subStringHashCode) {
                var equals = true
                var pLeft = 0
                var pRight = patternLength - 1
                var tLeft = i
                var tRight = i + pRight
                var steps = 0
                while (tLeft < tRight && steps <= STEPS) {
                    if (pattern[pLeft] != text[tLeft] || pattern[pRight] != text[tRight]) {
                        equals = false
                        break
                    }
                    pLeft++
                    tLeft++
                    pRight--
                    tRight--
                    steps++
                }
                if (equals) {
                    matches.addFirst(i)
                }
            }
        }
        for (match in matches) {
            try {
                writer.write(String.format("%s ", match.toString()))
            } catch (e: IOException) {
                e.printStackTrace()
            }
        }
        try {
            writer.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}