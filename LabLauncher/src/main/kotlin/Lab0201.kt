object Lab0201 {
	fun launch() {
		val arr1 = arrayOf(intArrayOf(1, -1, 0), intArrayOf(2, 0, -1), intArrayOf(1, 1, 1))
		val arr2 = arrayOf(intArrayOf(5, 3, 1), intArrayOf(-1, 2, 0), intArrayOf(-3, 0, 0))
		print(arr1)
		println()
		print(arr2)
		println()
		val res1 = sum(arr1, arr2)
		print(res1)
		println()
		val res2 = Array(3) { IntArray(3) }
		sum(arr1, arr2, res2)
		print(res2)
	}

	private fun sum(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
		val res = Array(arr1.size) { IntArray(arr1[1].size) }
		for (i in 1 until arr1.size) {
			for (j in 1 until arr1[i].size) {
				res[i][j] = arr1[i][j] + arr2[i][j]
			}
		}
		return res
	}

	private fun sum(arr1: Array<IntArray>, arr2: Array<IntArray>, res: Array<IntArray>) {
		for (i in 1 until arr1.size) {
			for (j in 1 until arr1[i].size) {
				res[i][j] = arr1[i][j] + arr2[i][j]
			}
		}
	}

	private fun print(arr: Array<IntArray>) {
		for (i in arr.indices) {
			for (j in arr[i].indices) {
				System.out.printf("%3d", arr[i][j])
			}
			println()
		}
	}
}