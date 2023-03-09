package hummel.transport

import hummel.optional.Improvable

class CarVolkswagenImproved(price: Int = 21000, color: String, private var improve: String) : CarVolkswagen(price, color), Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getTheInfo(): String {
		return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$" + " (" + improve + ")"
	}
}