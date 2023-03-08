package hummel

fun main() {
	val key = GUI.preprocess("АМОГУС")
	val msg = GUI.preprocess("ИРЧЖВЮЧНЪОЭЭУО")
	if (msg.isNotEmpty() && key.isNotEmpty()) {
		val plaintext = VigenereDecrypt.decryptVigenere(msg, key)
		println(plaintext)
	} else {
		println("ERROR")
	}
}

object VigenereDecrypt {
	fun decryptVigenereOldAlgo(msg: String, key: String): String {
		val square = VigenereSharedMethods.generateVigenereSquare()
		val currentKey = StringBuilder(key)

		for (x in msg.indices) {
			var i = 0
			val j = GUI.ALPHABET.indexOf(currentKey[x])
			for (c in GUI.ALPHABET.indices) {
				if (square[c][j] == msg[x]) {
					i = c
					break
				}
			}
			currentKey.append(GUI.ALPHABET[i])
		}
		return currentKey.substring(key.length).toString()
	}

	fun decryptVigenere(msg: String, key: String): String {
		val currentKey = StringBuilder(key)

		for (x in msg.indices) {
			val Q = GUI.ALPHABET.length
			val mn = GUI.ALPHABET.indexOf(msg[x])
			val kn = GUI.ALPHABET.indexOf(currentKey[x])
			currentKey.append(GUI.ALPHABET[(Q + mn - kn) % Q])
		}
		return currentKey.substring(key.length).toString()
	}
}