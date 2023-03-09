package hummel.transport

import hummel.optional.Improvable

class BicycleAistImproved(price: Int = 300, color: String, private var improve: String) : BicycleAist(price, color), Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getTheInfo(): String {
		return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$" + " (" + improve + ")"
	}
}