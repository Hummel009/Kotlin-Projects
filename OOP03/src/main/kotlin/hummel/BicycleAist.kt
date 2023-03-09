package hummel
class BicycleAist(private var color: String) : BicycleTransport("Aist"), Price {
	private var price = 100

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
