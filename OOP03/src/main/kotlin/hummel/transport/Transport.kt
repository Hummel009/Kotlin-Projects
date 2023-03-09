package hummel.transport

import java.io.Serializable

open class Transport : Serializable {
	private val serialVersionUID = 1L

	open fun getTheColor(): String {
		return "no"
	}

	open fun getTheInfo(): String {
		return "NULL"
	}

	open fun getThePrice(): Int {
		return 0
	}

	open fun getTheName(): String {
		return "NULL"
	}
}