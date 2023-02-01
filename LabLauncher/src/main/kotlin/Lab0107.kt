import java.util.*

object Lab0107 {
	private var input = Scanner(System.`in`)
	private var sogl: Set<Char> = HashSet(
		mutableListOf(
			'b',
			'c',
			'd',
			'f',
			'g',
			'h',
			'j',
			'k',
			'l',
			'm',
			'n',
			'p',
			'q',
			'r',
			's',
			't',
			'v',
			'x',
			'z'
		)
	)
	private var glas: Set<Char> = HashSet(mutableListOf('a', 'e', 'i', 'o', 'u', 'y'))
	fun launch() {
		println("Enter the string: ")
		val str = input.nextLine()
		var newStr = str.replace(",", "").replace(".", "") + " "
		while (newStr.contains("  ")) {
			newStr = newStr.replace("  ", " ")
		}
		val strList = newStr.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
		val last = strList.size - 1
		for (s in strList) {
			if (s != strList[last] && sogl.contains(s[s.length - 1]) && glas.contains(s[0])) {
				print("$s ")
			}
		}
		println()
	}
}