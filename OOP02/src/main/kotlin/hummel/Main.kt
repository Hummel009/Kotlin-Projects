package main.kotlin.hummel

import main.kotlin.hummel.Transport
import java.util.*
import kotlin.collections.ArrayList

val list: MutableList<Transport> = ArrayList()

fun main() {
	loadList()
	ask()
}

fun ask() {
	val scan = Scanner(System.`in`)

	loop@ while (true) {
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

			"exit" -> break@loop
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
}