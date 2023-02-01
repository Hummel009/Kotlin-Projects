import java.util.*

object Lab0108 {
	private var random = Random()
	fun launch() {
		val matrix = Array(10) { IntArray(10) }
		for (i in 0..8) {
			for (j in 0..9) {
				matrix[i][j] = random.nextInt(10)
			}
		}
		for (j in 0..9) {
			matrix[9][j] = 0
		}
		for (j in 0..9) {
			for (i in 0..8) {
				if (matrix[i][j] % 2 == 0) {
					matrix[9][j] += matrix[i][j]
				}
			}
		}
		printMatrix(matrix)
		for (j in 0..9) {
			for (k in 0 until 9 - 1) {
				for (i in 0 until 9 - 1 - k) {
					if (matrix[i][j] > matrix[i + 1][j]) {
						val temp = matrix[i][j]
						matrix[i][j] = matrix[i + 1][j]
						matrix[i + 1][j] = temp
					}
				}
			}
		}
		printMatrix(matrix)
		for (k in 0 until 9 - 1) {
			for (j in 0 until 9 - 1 - k) {
				if (matrix[9][j] > matrix[9][j + 1]) {
					for (i in 0..9) {
						val temp = matrix[i][j]
						matrix[i][j] = matrix[i][j + 1]
						matrix[i][j + 1] = temp
					}
				}
			}
		}
		printMatrix(matrix)
	}

	private fun printMatrix(arr: Array<IntArray>) {
		for (i in 0..8) {
			for (j in 0..9) {
				System.out.printf("%3d", arr[i][j])
			}
			println()
		}
		println()
		for (j in 0..9) {
			System.out.printf("%3d", arr[9][j])
		}
		println()
		println()
	}
}