package hummel.transport

import hummel.optional.Editable

open class BicycleStels(private var color: String) : BicycleTransport("Stels"), Editable {
	private var price = 300

	constructor(color: String, price: Int) : this(color) {
		this.price = price
	}

	override fun getPrice(): Int {
		return price
	}

	override fun getColor(): String {
		return color
	}

	override fun getFullInfo(): String {
		return getName() + " (" + getColor() + "): " + getPrice() + "$"
	}

	override fun setPrice(price: Int) {
		this.price = price
	}

	override fun setColor(color: String) {
		this.color = color
	}
}