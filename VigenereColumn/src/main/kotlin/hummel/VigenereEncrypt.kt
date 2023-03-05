package main.kotlin.hummel

fun main() {
	val key = FileEncryptionGUI.preprocess("АМОГУС")
	val msg = FileEncryptionGUI.preprocess("ИДИ ДОМОЙ СКОРЕЕ")
	if (msg.isNotEmpty() && key.isNotEmpty()) {
		val ciphertext = VigenereEncrypt.encryptVigenere(msg, key)
		println(ciphertext)
	} else {
		println("ERROR")
	}
}

object VigenereEncrypt {
	fun encryptVigenereOldAlgo(msg: String, key: String): String {
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

	fun encryptVigenere(msg: String, key: String): String {
		var newKey = key + msg
		newKey = newKey.substring(0, newKey.length - key.length)
		var encryptMsg = ""

		for (x in msg.indices) {
			val Q = FileEncryptionGUI.ALPHABET.length
			val mn = FileEncryptionGUI.ALPHABET.indexOf(msg[x])
			val kn = FileEncryptionGUI.ALPHABET.indexOf(newKey[x])
			encryptMsg += FileEncryptionGUI.ALPHABET[(Q + mn + kn) % Q]
		}
		return encryptMsg
	}
}