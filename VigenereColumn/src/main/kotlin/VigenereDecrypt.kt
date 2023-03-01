package main.java.hummel

fun main() {
    val key = FileEncryptionGUI.preprocess("АМОГУС")
    val msg = FileEncryptionGUI.preprocess("ИРЧЖВЮЧНЪОЭЭУО")
    if (key.isNotEmpty() && key.isNotEmpty()) {
        val plaintext = VigenereDecrypt.decryptVigenere(msg, key)
        println(plaintext)
    } else {
        println("ERROR")
    }
}

object VigenereDecrypt {
    fun decryptVigenere(msg: String, key: String): String {
        val square = VigenereSharedMethods.generateVigenereSquare()
        val currentKey = StringBuilder(key)

        for (x in msg.indices) {
            var i = 0
            val j = FileEncryptionGUI.ALPHABET.indexOf(currentKey[x])
            for (c in FileEncryptionGUI.ALPHABET.indices) {
                if (square[c][j] == msg[x]) {
                    i = c
                    break
                }
            }
            currentKey.append(FileEncryptionGUI.ALPHABET[i])
        }
        return currentKey.substring(key.length).toString()
    }
}