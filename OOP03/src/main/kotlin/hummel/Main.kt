package hummel

import java.io.*
import java.util.*

var list: MutableList<Transport> = ArrayList()
fun main() {
	list = deserializeList()
	ask()
}

fun ask() {
	val scan = Scanner(System.`in`)

	loop@ while (true) {
		serializeList(list)
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

			"sellVW" -> {
				sellVW()
			}

			"sellAist" -> {
				sellAist()
			}

			"sellLada" -> {
				sellLada()
			}

			"sellStels" -> {
				sellStels()
			}

			"editCar" -> {
				editCar()
			}

			"exit" -> break@loop
		}
	}
}

fun editCar() {
	val scan = Scanner(System.`in`)
	val str = scan.nextLine()
	var found = false

	val currentMap = HashMap<Int, Transport>()
	var i = 0
	for (item in list) {
		if (item.getName() == str) {
			currentMap[i++] = item
			println(item.getFullInfo())
			found = true
		}
	}
	if (!found) {
		println("No info found")
	} else {
		println("Select the item to edit")
		val scan2 = Scanner(System.`in`)
		val num = scan2.nextInt()
		val item = currentMap[num]

		val scan3 = Scanner(System.`in`)
		val price = scan3.nextInt()
		if (item is Price) {
			item.newPrice(price)
		}
	}
}

fun sellVW() {
	val scan1 = Scanner(System.`in`)
	val scan2 = Scanner(System.`in`)
	val price = scan1.nextInt()
	val color = scan2.nextLine()
	list.add(CarVolkswagen(color, price))
	println("Added")
}

fun sellAist() {
	val scan1 = Scanner(System.`in`)
	val scan2 = Scanner(System.`in`)
	val price = scan1.nextInt()
	val color = scan2.nextLine()
	list.add(BicycleAist(color, price))
	println("Added")
}

fun sellStels() {
	val scan1 = Scanner(System.`in`)
	val scan2 = Scanner(System.`in`)
	val price = scan1.nextInt()
	val color = scan2.nextLine()
	list.add(BicycleStels(color, price))
	println("Added")
}

fun sellLada() {
	val scan1 = Scanner(System.`in`)
	val scan2 = Scanner(System.`in`)
	val price = scan1.nextInt()
	val color = scan2.nextLine()
	list.add(CarLada(color, price))
	println("Added")
}

fun searchByName() {
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

fun loadList() {
	list.add(BicycleAist("Red", 150))
	list.add(BicycleStels("Red"))
	list.add(CarVolkswagen("Red", 18500))
	list.add(CarLada("Red"))

	list.add(BicycleAist("Green"))
	list.add(BicycleStels("Green", 350))
	list.add(CarVolkswagen("Green"))
	list.add(CarLada("Green"))

	list.add(BicycleAist("Blue"))
	list.add(BicycleStels("Blue"))
	list.add(CarVolkswagen("Blue"))
	list.add(CarLada("Blue", 5500))

	list.add(BicycleStelsImprovement("Blue", "Packed"))
	list.add(CarVolkswagenImprovement("Grey", "Sportline"))
	list.add(CarVolkswagenImprovement("Grey", "Chroming"))
}


fun serializeList(list: List<Transport>) {
	list.forEachIndexed { index, transport ->
		val filename = "memory/transport_$index.ser"
		val outputStream = FileOutputStream(filename)
		val objectOutputStream = ObjectOutputStream(outputStream)
		objectOutputStream.writeObject(transport)
		objectOutputStream.close()
		outputStream.close()
		println("Object has been serialized to $filename")
	}
}

fun deserializeList(): MutableList<Transport> {
	var index = 0
	while (File("memory/transport_$index.ser").exists()) {
		val fileInputStream = FileInputStream("memory/transport_$index.ser")
		val objectInputStream = ObjectInputStream(fileInputStream)
		val obj = objectInputStream.readObject()
		if (obj is Transport) {
			list.add(obj)
		}
		objectInputStream.close()
		fileInputStream.close()
		println("Object has been deserialized from memory/transport_$index.ser")
		index++
	}
	return list
}