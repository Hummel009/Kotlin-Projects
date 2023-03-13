package hummel.transport

import hummel.optional.Editable

open class BicycleStels(var price: Int = 300, var color: String = "No") : BicycleTransport("Stels"), Editable {
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