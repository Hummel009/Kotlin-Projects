package main.kotlin.hummel

object ColumnSharedMethods {
	fun sort(square: Array<Array<String>>, row: Int) {
		for (i in 0 until square[0].size - 1) {
			var minIndex = i
			for (j in i + 1 until square[0].size) {
				if (square[row][j] < square[row][minIndex]) {
					minIndex = j
				}
			}
			if (minIndex != i) {
				for (k in square.indices) {
					val temp = square[k][i]
					square[k][i] = square[k][minIndex]
					square[k][minIndex] = temp
				}
			}
		}
	}

	fun show(square: Array<Array<String>>) {
		for (i in square.indices) {
			var hasAtLeastOneLetter = false
			for (j in square[0].indices) {
				if (square[i][j] != " ") {
					print(square[i][j] + " ")
					hasAtLeastOneLetter = true
				}
			}
			if (hasAtLeastOneLetter) {
				println()
			}
		}
	}
}