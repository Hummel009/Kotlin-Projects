package main.java.hummel

import java.util.*

fun main() {
    val key = FileEncryptionGUI.preprocess("АБВГД")
    val msg = FileEncryptionGUI.preprocess("ИНФОРМАЦИОННАЯ ТЕОРИЯ")
    if (key.isNotEmpty() && key.isNotEmpty()) {
        val ciphertext = ColumnEncrypt.encryptColumn(msg, key, true)
        println(ciphertext)
    } else {
        println("ERROR")
    }
}

object ColumnEncrypt {
    private fun scanEncryptTable(square: Array<Array<String>>, key: String, msg: String): String {
        ColumnSharedMethods.sort(square, 1)
        val sb = StringBuilder()
        for (j in key.indices) {
            for (i in 3 until msg.length + 3) {
                if (square[i][j] != " ") {
                    sb.append(square[i][j])
                }
            }
        }
        return sb.toString()
    }

    private fun fillEncryptTable(square: Array<Array<String>>, keyword: String, message: String) {
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

        var currentPos = 0
        var currentLine = 3
        var currentRule = 1

        loop@ while (true) {
            for (i in keyword.indices) {
                square[currentLine][i] = message[currentPos].toString()
                currentPos++
                if (currentPos >= message.length) {
                    break@loop
                }
                if (currentRule == keyword.length + 1) {
                    currentRule = 1
                }
                if (square[1][i] == currentRule.toString()) {
                    currentLine++
                    currentRule++
                    break
                }
            }
        }
    }

    fun encryptColumn(msg: String, key: String, show: Boolean): String {
        val square = Array(msg.length + 3) { Array(key.length) { " " } }
        fillEncryptTable(square, key, msg)
        if (show) {
            ColumnSharedMethods.show(square)
        }
        return scanEncryptTable(square, key, msg)
    }
}