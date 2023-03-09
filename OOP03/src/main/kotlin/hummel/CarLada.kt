package hummel
class CarLada(private var color: String) : CarTransport("Lada"), Price {
	private var price = 5000

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

	override fun newPrice(i: Int) {
		price = i
	}
}