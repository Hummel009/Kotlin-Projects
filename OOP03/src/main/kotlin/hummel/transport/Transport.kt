package hummel.transport

import java.io.Serializable

open class Transport : Serializable {
	private val serialVersionUID = 1L

	open fun getColor(): String {
		return "no"
	}

	open fun getFullInfo(): String {
		return "NULL"
	}

	open fun getPrice(): Int {
		return 0
	}

	open fun getName(): String {
		return "NULL"
	}
}