package hummel.transport

import hummel.optional.Improvable

class BicycleStelsImproved(price: Int = 400, color: String, private var improve: String) : BicycleStels(price, color), Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getTheInfo(): String {
		return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$" + " (" + improve + ")"
	}
}