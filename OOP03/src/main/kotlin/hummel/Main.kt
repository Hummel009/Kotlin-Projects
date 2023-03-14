package hummel

import hummel.Shop.transport
import hummel.optional.Editable
import hummel.transport.*
import hummel.utils.JsonUtils
import hummel.utils.StandardUtils
import hummel.utils.XmlUtils
import java.util.*
import javax.xml.bind.annotation.XmlElementWrapper
import javax.xml.bind.annotation.XmlRootElement


@XmlRootElement
object Shop {
	@XmlElementWrapper(name = "transports", nillable = true)
	@JvmStatic
	var transport: MutableList<Transport> = ArrayList()
}

fun main() {
	val shop = Shop
	val selector = Scanner(System.`in`)

	println("Select the type of data saving and loading:")
	val type = selector.nextLine()
	when (type) {
		"xml" -> {
			XmlUtils.deserialize(shop)
		}

		"bin" -> {
			StandardUtils.deserialize(shop)
		}

		"json" -> {
			JsonUtils.deserialize(shop)
		}
	}

	val scan = Scanner(System.`in`)

	loop@ while (true) {
		println("Enter the function:")
		when (scan.nextLine()) {
			"price" -> {
				searchByPrice()
			}

			"color" -> {
				searchByColor()
			}

			"name" -> {
				searchByName()
			}

			"clear" -> {
				shop.transport.clear()
			}

			"load" -> {
				shop.transport.addAll(StandardUtils.loadDefaultList())
			}

			"sell" -> {
				sell()
			}

			"edit" -> {
				edit()
			}

			"exit" -> break@loop
		}
		when (type) {
			"xml" -> {
				XmlUtils.serialize(shop)
			}

			"bin" -> {
				StandardUtils.serialize(shop)
			}

			"json" -> {
				JsonUtils.serialize(shop)
			}
		}
	}
}

fun edit() {
	println("Enter the name of the transport:")
	val scan = Scanner(System.`in`)
	val str = scan.nextLine()
	var found = false

	val currentMap = HashMap<Int, Transport>()
	var i = 0
	for (transport in transport) {
		if (transport.getTheName() == str) {
			currentMap[i++] = transport
			println("${i - 1} ${transport.getTheInfo()}")
			found = true
		}
	}
	if (!found) {
		println("No info found")
	} else {
		println("Select the transport to edit")
		val scan2 = Scanner(System.`in`)
		val num = scan2.nextInt()
		val transport = currentMap[num]

		println("Enter the new price")
		val scan3 = Scanner(System.`in`)
		val price = scan3.nextInt()
		println("Enter the new color")
		val scan4 = Scanner(System.`in`)
		val color = scan4.nextLine()
		if (transport is Editable) {
			transport.setThePrice(price)
			transport.setTheColor(color)
		}
	}
}

fun sell() {
	println("Enter the name of the transport")
	val scan0 = Scanner(System.`in`)
	val type = scan0.nextLine()
	println("Enter the price of the transport")
	val scan1 = Scanner(System.`in`)
	val price = scan1.nextInt()
	println("Enter the color of the transport")
	val scan2 = Scanner(System.`in`)
	val color = scan2.nextLine()
	when (type) {
		"Volkswagen" -> {
			transport.add(CarVolkswagen(price, color))
		}

		"Lada" -> {
			transport.add(CarLada(price, color))
		}

		"Aist" -> {
			transport.add(BicycleAist(price, color))
		}

		"Stels" -> {
			transport.add(BicycleStels(price, color))
		}
	}
}

fun searchByName() {
	println("Enter the name of the transport")
	val scan = Scanner(System.`in`)
	val str = scan.nextLine()
	var found = false

	for (car in transport) {
		if (car.getTheName() == str) {
			println(car.getTheInfo())
			found = true
		}
	}

	if (!found) {
		println("No info found")
	}
}

fun searchByColor() {
	println("Enter the color of the transport")
	val scan = Scanner(System.`in`)
	val str = scan.nextLine()
	var found = false

	for (car in transport) {
		if (car.getTheColor() == str) {
			println(car.getTheInfo())
			found = true
		}
	}

	if (!found) {
		println("No info found")
	}
}

fun searchByPrice() {
	println("Enter the price of the transport")
	val scan = Scanner(System.`in`)
	val price = scan.nextInt()
	var found = false

	for (car in transport) {
		if (car.getThePrice() == price) {
			println(car.getTheInfo())
			found = true
		}
	}

	if (!found) {
		println("No info found")
	}
}