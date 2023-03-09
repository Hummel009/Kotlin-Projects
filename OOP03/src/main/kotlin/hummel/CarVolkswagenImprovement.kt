package hummel

class CarVolkswagenImprovement(color: String, private var improve: String) : CarVolkswagen(color), Improvement {
	override fun getImprovement(): String {
		return improve
	}

	override fun getFullInfo(): String {
		return getName() + " (" + getColor() + "): " + getPrice() + "$" + "(" + improve + ")"
	}
}