package hummel.transport

import hummel.optional.Improvable

class CarVolkswagenImproved(price: Int = 21000, color: String = "No", var improve: String = "No") :
	CarVolkswagen(price, color), Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getTheInfo(): String {
		return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$" + " (" + improve + ")"
	}
}