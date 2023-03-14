package hummel.transport

import hummel.optional.Improvable

class BicycleAistImproved(price: Int = 300, color: String = "No", var improve: String = "No") :
	BicycleAist(price, color), Improvable {
	override fun getImprovement(): String {
		return improve
	}

	override fun getTheInfo(): String {
		return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$" + " (" + improve + ")"
	}
}