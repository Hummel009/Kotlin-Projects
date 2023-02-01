import java.util.*

object Ex0502 {
    var scanner = Scanner(System.`in`)
    var DIVIDER = 1000000007
    var BASE = 263
    fun launch() {
        val hashTable = HashTable(scanner.nextInt())
        val operationsCount = scanner.nextInt()
        for (i in 0 until operationsCount) {
            val operation = scanner.next()
            if (operation.startsWith("a")) {
                hashTable.add(scanner.next())
            } else if (operation.startsWith("c")) {
                println(hashTable.getValues(scanner.nextInt()))
            } else if (operation.startsWith("f")) {
                println(hashTable.find(scanner.next()))
            } else {
                hashTable.delete(scanner.next())
            }
        }
    }

    class HashTable(size: Int) {
        var table: Array<Words?>

        init {
            table = arrayOfNulls(size)
        }

        fun add(string: String) {
            val hashCode = hashCode(string)
            if (table[hashCode] == null) {
                table[hashCode] = Words()
            }
            table[hashCode]!!.add(string)
        }

        fun delete(string: String) {
            val hashCode = hashCode(string)
            if (table[hashCode] != null && !table[hashCode]!!.isEmpty) {
                table[hashCode]!!.delete(string)
            }
        }

        fun find(string: String): String {
            val hashCode = hashCode(string)
            if (table[hashCode] == null || table[hashCode]!!.isEmpty) {
                return "no"
            }
            return if (table[hashCode]!!.contains(string)) {
                "yes"
            } else "no"
        }

        fun getValues(hashCode: Int): String {
            return if (table[hashCode] == null || table[hashCode]!!.isEmpty) {
                ""
            } else table[hashCode]!!.values
        }

        fun hashCode(string: String): Int {
            var hashCode: Long = 0
            var i = 0
            for (ch in string.toCharArray()) {
                hashCode = ((hashCode + ch.code.toLong() * pow(i)) % DIVIDER + DIVIDER) % DIVIDER
                i++
            }
            return (hashCode % table.size).toInt()
        }

        fun pow(pow: Int): Long {
            var result: Long = 1
            for (i in 0 until pow) {
                result = result * BASE % DIVIDER
            }
            return result
        }

        class Words {
            var wordsList: MutableList<String>

            init {
                wordsList = LinkedList()
            }

            fun add(string: String) {
                if (!contains(string)) {
                    (wordsList as LinkedList<String>).addFirst(string)
                }
            }

            operator fun contains(string: String): Boolean {
                var contains = false
                for (str in wordsList) {
                    if (str == string) {
                        contains = true
                    }
                }
                return contains
            }

            fun delete(string: String) {
                val iterator = wordsList.iterator()
                while (iterator.hasNext()) {
                    if (iterator.next() == string) {
                        iterator.remove()
                        break
                    }
                }
            }

            val values: String
                get() {
                    val stringBuilder = StringBuilder()
                    for (aWordsList in wordsList) {
                        stringBuilder.append(aWordsList)
                        stringBuilder.append(" ")
                    }
                    return stringBuilder.toString()
                }
            val isEmpty: Boolean
                get() = wordsList.isEmpty()
        }
    }
}