package hummel

import hummel.optional.Editable
import hummel.transport.*
import java.util.*

var list: MutableList<Transport> = ArrayList()

fun main() {
	list = Data.deserializeListJson()
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

			"sell" -> {
				sell()
			}

			"edit" -> {
				edit()
			}

			"exit" -> break@loop
		}
		Data.serializeListJson(list)
	}
}

fun edit() {
	println("Enter the name of the transport:")
	val scan = Scanner(System.`in`)
	val str = scan.nextLine()
	var found = false

	val currentMap = HashMap<Int, Transport>()
	var i = 0
	for (transport in list) {
		if (transport.getName() == str) {
			currentMap[i++] = transport
			println("${i - 1} ${transport.getFullInfo()}")
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
			transport.setPrice(price)
			transport.setColor(color)
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
			list.add(CarVolkswagen(color, price))
		}

		"Lada" -> {
			list.add(CarLada(color, price))
		}

		"Aist" -> {
			list.add(BicycleAist(color, price))
		}

		"Stels" -> {
			list.add(BicycleStels(color, price))
		}
	}
}

fun searchByName() {
	println("Enter the name of the transport")
	val scan = Scanner(System.`in`)
	val str = scan.nextLine()
	var found = false

	for (car in list) {
		if (car.getName() == str) {
			println(car.getFullInfo())
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

	for (car in list) {
		if (car.getColor() == str) {
			println(car.getFullInfo())
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

	for (car in list) {
		if (car.getPrice() == price) {
			println(car.getFullInfo())
			found = true
		}
	}

	if (!found) {
		println("No info found")
	}
}