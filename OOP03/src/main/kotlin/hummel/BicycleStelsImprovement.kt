package hummel

class BicycleStelsImprovement(color: String, private var improve: String) : BicycleStels(color), Improvement {
	override fun getImprovement(): String {
		return improve
	}

	override fun getFullInfo(): String {
		return getName() + " (" + getColor() + "): " + getPrice() + "$" + " (" + improve + ")"
	}
}