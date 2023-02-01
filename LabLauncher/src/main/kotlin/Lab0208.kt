import java.util.*

object Lab0208 {
	private var input = Scanner(System.`in`)
	private fun readln(input: Scanner, message: String?): Int {
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
		val num = readln(input, "Enter the number: ")
		val factorial = factorial(num)
		println(factorial)
	}

	private fun factorial(num: Int): Int {
		return if (num >= 1) {
			num * factorial(num - 1)
		} else 1
	}
}