import java.util.*
import kotlin.collections.ArrayList

object Lab0212 {
	private var input: Scanner = Scanner(System.`in`)
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
		val sus = ArrayList<Int>()
		val amogus = ArrayList<Int>()
		val n = readln(input, "Enter the number: ")
		for (i in 1..n) {
			sus.add(i)
			amogus.add(n - i + 1)
		}
		val iter1: Iterator<Int> = sus.iterator()
		val iter2: Iterator<Int> = amogus.iterator()
		var result = 1
		while (iter1.hasNext() && iter2.hasNext()) {
			result *= iter1.next() + iter2.next()
		}
		println(result)
	}
}