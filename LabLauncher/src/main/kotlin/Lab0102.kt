import java.util.*

object Lab0102 {
	private val input: Scanner = Scanner(System.`in`)
	fun readln(input: Scanner, message: String?): Int {
		var n = 0
		var error: Boolean
		do {
			error = false
			print(message)
			try {
				n = input.nextInt()
			} catch (e: InputMismatchException) {
				error = true
				input.next()
			}
		} while (error)
		return n
	}

	fun launch() {
		val n = readln(input, "Enter the quantity of elements: ")
		val arr = IntArray(n)
		for (i in 0..n - 1) {
			arr[i] = readln(input, "Enter the element: ")
			if (arr[i] < 0) {
				arr[i] *= -1
			}
		}
		for (i in 0..n - 2) {
			if (arr[i] != 0) {
				do {
					if (arr[i] < arr[i + 1]) {
						arr[i + 1] = arr[i + 1] % arr[i]
					} else {
						val temp = arr[i]
						arr[i] = arr[i + 1]
						arr[i + 1] = temp
					}
				} while (arr[i] != 0)
			}
		}
		println("GCD is " + arr[n - 1])
	}
}