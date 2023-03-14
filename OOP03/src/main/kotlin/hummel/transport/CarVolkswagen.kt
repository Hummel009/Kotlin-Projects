package hummel.transport

import hummel.optional.Editable

open class CarVolkswagen(var price: Int = 18000, var color: String = "No") : CarTransport("Volkswagen"), Editable {
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