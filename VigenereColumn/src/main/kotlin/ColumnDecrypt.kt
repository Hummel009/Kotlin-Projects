package main.java.hummel

import java.util.*

fun main() {
    val key = FileEncryptionGUI.preprocess("БВГДЕ")
    val msg = FileEncryptionGUI.preprocess("ИНОАНЕОИФРЦНРЯМИАОЯТ")
    if (msg.isNotEmpty() && key.isNotEmpty()) {
        val plaintext = ColumnDecrypt.decryptColumn(msg, key, true)
        println(plaintext)
    } else {
        println("ERROR")
    }
}

object ColumnDecrypt {
    private fun scanDecryptTable(square: Array<Array<String>>, key: String, msg: String): String {
        val sb = StringBuilder()
        for (i in 3 until msg.length + 3) {
            for (j in key.indices) {
                if (square[i][j] != " ") {
                    sb.append(square[i][j])
                }
            }
        }
        return sb.toString()
    }

    private fun fillDecryptTable(square: Array<Array<String>>, keyword: String, message: String) {
        for (i in keyword.indices) {
            square[0][i] = keyword[i].toString()
            square[1][i] = FileEncryptionGUI.ALPHABET.indexOf(square[0][i]).toString()
            square[2][i] = (i + 1).toString()
        }

        val sortable = IntArray(keyword.length)
        val usedIDs = HashSet<Int>()
        for (i in keyword.indices) {
            sortable[i] = square[1][i].toInt()
        }

        Arrays.sort(sortable)

        for (i in keyword.indices) {
            var newID = (sortable.indexOf(square[1][i].toInt()) + 1)
            if (!usedIDs.contains(newID)) {
                square[1][i] = newID.toString()
                usedIDs.add(newID)
            } else {
                newID++
                square[1][i] = newID.toString()
                usedIDs.add(newID)
            }
        }

        var currentPos = 1
        var currentLine = 3
        var currentRule = 1

        loop@ while (true) {
            for (i in keyword.indices) {
                if (currentPos > message.length) {
                    break@loop
                }
                if (currentRule == keyword.length + 1) {
                    currentRule = 1
                }
                square[currentLine][i] = "*"
                currentPos++
                if (square[1][i] == currentRule.toString()) {
                    currentLine++
                    currentRule++
                    break
                }
            }
        }
        ColumnSharedMethods.sort(square, 1)

        var count = 0
        for (j in keyword.indices) {
            for (i in 3 until message.length + 3) {
                if (square[i][j] == "*") {
                    square[i][j] = message[count].toString()
                    count++
                }
            }
        }
        ColumnSharedMethods.sort(square, 2)
    }

    fun decryptColumn(msg: String, key: String, show: Boolean): String {
        val square = Array(msg.length + 3) { Array(key.length) { " " } }
        fillDecryptTable(square, key, msg)
        if (show) {
            ColumnSharedMethods.show(square)
        }
        return scanDecryptTable(square, key, msg)
    }
}