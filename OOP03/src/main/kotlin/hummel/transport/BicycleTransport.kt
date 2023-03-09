package hummel.transport

open class BicycleTransport(private var name: String) : Transport() {
	override fun getName(): String {
		return name
	}
}