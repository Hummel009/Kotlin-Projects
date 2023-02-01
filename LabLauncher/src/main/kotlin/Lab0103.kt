import java.util.*
import kotlin.collections.HashSet

object Lab0103 {
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
		println()
		val arr = IntArray(n)
		for (i in 0 until n) {
			arr[i] = readln(input, "Enter the element: ")
		}
		val nums: HashSet<Int> = HashSet()
		for (i in 0 until n) {
			nums.add(arr[i])
		}
		println("Unique elements: $nums")
		System.out.println("The quantity of unique elements: " + nums.size)
		var max = 0
		for (i in 0 until n) {
			for (j in 0 until n) {
				if (arr[i] == arr[j] && i != j) {
					max = arr[i]
					break
				}
			}
		}
		for (i in 0 until n) {
			for (j in 0 until n) {
				if (arr[i] == arr[j] && i != j && max < arr[i]) {
					max = arr[i]
				}
			}
		}
		println("Max duplicate: $max")
	}
}