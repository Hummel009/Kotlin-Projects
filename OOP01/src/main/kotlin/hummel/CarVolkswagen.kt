package main.kotlin.hummel

class CarVolkswagen(private var color: String) : CarTransport("Volkswagen") {
	private var price = 18000

	constructor(color: String, i: Int) : this(color) {
		this.price = i
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
}