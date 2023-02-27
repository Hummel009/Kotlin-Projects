package main.java.hummel

fun main() {
    val key = FileEncryptionGUI.preprocess("АМОГУС")
    val msg = FileEncryptionGUI.preprocess("ИДИ ДОМОЙ СКОРЕЕ")

    val ciphertext = VigenereEncrypt.encryptVigenere(msg, key)
    println(ciphertext)
}

object VigenereEncrypt {
    fun encryptVigenere(msg: String, key: String): String {
        val square = VigenereSharedMethods.generateVigenereSquare()
        var newKey = key + msg
        newKey = newKey.substring(0, newKey.length - key.length)
        var encryptMsg = ""

        for (x in msg.indices) {
            val i = FileEncryptionGUI.ALPHABET.indexOf(msg[x])
            val j = FileEncryptionGUI.ALPHABET.indexOf(newKey[x])
            val total = square[i][j]
            encryptMsg += total
        }
        return encryptMsg
    }
}