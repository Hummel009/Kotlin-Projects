package hummel

fun main() {
	val key = GUI.preprocess("АМОГУС")
	val msg = GUI.preprocess("ИДИ ДОМОЙ СКОРЕЕ")
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
			val i = GUI.ALPHABET.indexOf(msg[x])
			val j = GUI.ALPHABET.indexOf(newKey[x])
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
			val Q = GUI.ALPHABET.length
			val mn = GUI.ALPHABET.indexOf(msg[x])
			val kn = GUI.ALPHABET.indexOf(newKey[x])
			encryptMsg += GUI.ALPHABET[(Q + mn + kn) % Q]
		}
		return encryptMsg
	}
}