package hummel.transport

import hummel.optional.Improvable

class CarVolkswagenImproved(color: String, private var improve: String) : CarVolkswagen(color), Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getFullInfo(): String {
		return getName() + " (" + getColor() + "): " + getPrice() + "$" + " (" + improve + ")"
	}
}