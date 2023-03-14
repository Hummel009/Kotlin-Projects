package hummel.transport

import hummel.optional.Improvable

class CarLadaImproved(price: Int = 6500, color: String = "No", var improve: String = "No") : CarLada(price, color),
	Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getTheInfo(): String {
		return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$" + " (" + improve + ")"
	}
}