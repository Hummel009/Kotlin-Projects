package hummel.transport

import hummel.optional.Editable

open class BicycleAist(var price: Int = 200, var color: String) : BicycleTransport("Aist"), Editable {
	override fun getThePrice(): Int {
		return price
	}

	override fun getTheColor(): String {
		return color
	}

	override fun getTheInfo(): String {
		return getTheName() + " (" + getTheColor() + "): " + getThePrice() + "$"
	}

	override fun setThePrice(price: Int) {
		this.price = price
	}

	override fun setTheColor(color: String) {
		this.color = color
	}
}
