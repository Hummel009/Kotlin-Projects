object Lab0105 {
	fun doCalcsWithEps(limit: Double) {
		var eps = 0.0
		var x = 0.1
		while (x < 1.0) {
			var k = 1
			var f = 0.0
			do {
				val temp = f
				f += Math.pow(x, (3 * k + 1).toDouble()) / ((4 * k - 1) * (4 * k - 2))
				k += 1
				eps = Math.abs(f - temp)
			} while (eps > limit)
			println("X = $x; K = $k; F =$f")
			x += 0.1
		}
		println()
	}

	fun launch() {
		doCalcsWithEps(1e-5)
		doCalcsWithEps(1e-6)
	}
}