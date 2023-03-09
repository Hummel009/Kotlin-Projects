package hummel.transport

import hummel.optional.Improvable

class BicycleStelsImproved(color: String, private var improve: String) : BicycleStels(color), Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getFullInfo(): String {
		return getName() + " (" + getColor() + "): " + getPrice() + "$" + " (" + improve + ")"
	}
}