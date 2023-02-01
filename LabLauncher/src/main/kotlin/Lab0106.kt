import java.util.*

object Lab0106 {
	private var input = Scanner(System.`in`)
	private val daysSinceNY = EnumMap<Month, Int>(Month::class.java)
	private val monthCapacity = EnumMap<Month, Int>(Month::class.java)

	init {
		daysSinceNY[Month.JAN] = 0
		daysSinceNY[Month.FEB] = 31
		daysSinceNY[Month.MAR] = 59
		daysSinceNY[Month.APR] = 90
		daysSinceNY[Month.MAY] = 120
		daysSinceNY[Month.JUN] = 151
		daysSinceNY[Month.JUL] = 181
		daysSinceNY[Month.AUG] = 212
		daysSinceNY[Month.SEP] = 243
		daysSinceNY[Month.OCT] = 273
		daysSinceNY[Month.NOV] = 304
		daysSinceNY[Month.DEC] = 334
		monthCapacity[Month.JAN] = 31
		monthCapacity[Month.FEB] = 28
		monthCapacity[Month.MAR] = 31
		monthCapacity[Month.APR] = 30
		monthCapacity[Month.MAY] = 31
		monthCapacity[Month.JUN] = 30
		monthCapacity[Month.JUL] = 31
		monthCapacity[Month.AUG] = 31
		monthCapacity[Month.SEP] = 30
		monthCapacity[Month.OCT] = 31
		monthCapacity[Month.NOV] = 30
		monthCapacity[Month.DEC] = 31
	}

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
		println("Enter the date in three steps like, 2002 07 10")
		var year: Int
		do {
			year = readln(input, "Enter the year: ")
		} while (year < 1)
		val isHigher = year % 4 == 0 && year % 100 != 0 && year % 400 == 0
		var month: Month? = null
		var temp1: Int
		do {
			temp1 = readln(input, "Enter the month number: ")
			for (m in Month.values()) {
				if (m.num == temp1) {
					month = m
					break
				}
			}
		} while (temp1 > 12 || temp1 < 1)
		var date: Int
		val temp2: Int = if (month == Month.FEB && isHigher) {
			29
		} else {
			monthCapacity[month]!!
		}
		do {
			date = readln(input, "Enter the day: ")
		} while (date > temp2 || date < 1)
		println(date.toString() + " " + month.toString() + " " + year)
		var result = date + daysSinceNY[month]!! + (year - 1) * 365
		var additional = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400
		if (isHigher && daysSinceNY[month]!! + date > 59) {
			additional += 1
		}
		result += additional
		val day = result % 7
		var weekday: Weekday? = null
		for (wd in Weekday.values()) {
			if (wd.num == day) {
				weekday = wd
				break
			}
		}
		println(weekday.toString())
	}

	enum class Month(var num: Int) {
		JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6), JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12)
	}

	enum class Weekday(var num: Int) {
		MON(1), TUE(2), WED(3), THI(4), FRI(5), SAT(6), SUN(0)
	}
}