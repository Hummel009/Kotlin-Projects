object Lab0101 {
	fun launch() {
		var x = 0.6
		while (x <= 1.1) {
			for (n in 10..15) {
				var sum = 0.0
				for (k in 1..n) {
					val termR1 = Math.exp(1.2 * k)
					val termR2 = ((k - 10) / (k + 30)).toDouble()
					val termR3 = Math.sqrt(k * Math.exp(Math.log((n + 5).toDouble()) / 3))
					val termR4 = Math.log(Math.sqrt(n * x))
					val numerator = Math.exp(Math.log(termR1 + termR2) / k)
					val denominator = termR3 + termR4
					sum += numerator / denominator
				}
				val termL1 = Math.exp(n * x) / 2
				val termL2 = Math.exp(Math.log(n * x) / 3)
				val f = sum + Math.exp(Math.log(termL1 + termL2) / 3)
				println("X = $x, N = $n, F = $f")
			}
			x += 0.1
		}
	}
}