package hummel

object VigenereSharedMethods {
	fun generateVigenereSquare(): Array<CharArray> {
		val alphabet = GUI.ALPHABET.toCharArray()
		val square = Array(alphabet.size) { CharArray(alphabet.size) }

		for (row in alphabet.indices) {
			for (col in alphabet.indices) {
				val shift = (col + row) % alphabet.size
				square[row][col] = alphabet[shift]
			}
		}
		return square
	}
}