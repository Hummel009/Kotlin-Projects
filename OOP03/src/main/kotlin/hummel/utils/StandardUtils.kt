package hummel.utils

import hummel.Shop
import hummel.transport.*
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

object StandardUtils {
	fun serialize(shop: Shop) {
		val filename = "memory/transports.ser"
		val outputStream = FileOutputStream(filename)
		val objectOutputStream = ObjectOutputStream(outputStream)
		objectOutputStream.writeObject(shop.transport)
		objectOutputStream.close()
		outputStream.close()
		println("List was serialized")
	}

	fun deserialize(shop: Shop) {
		try {
			val filename = "memory/transports.ser"
			val fileInputStream = FileInputStream(filename)
			val objectInputStream = ObjectInputStream(fileInputStream)
			val obj = objectInputStream.readObject()
			val transports: MutableList<Transport> = ArrayList()

			if (obj is List<*>) {
				obj.filterIsInstance<Transport>().forEach { transports.add(it) }
			}
			objectInputStream.close()
			fileInputStream.close()
			println("List was deserialized")
			shop.transport = transports
		} catch (e: Exception) {
			println("Error. Default list is loaded")
			shop.transport = loadDefaultList()
		}
	}

	fun loadDefaultList(): MutableList<Transport> {
		val transports = ArrayList<Transport>()
		transports.add(BicycleAist(250, "Red"))
		transports.add(BicycleStels(color = "Red"))
		transports.add(CarVolkswagen(18500, "Red"))
		transports.add(CarLada(color = "Red"))

		transports.add(BicycleAist(color = "Green"))
		transports.add(BicycleStels(color = "Green"))
		transports.add(CarVolkswagen(color = "Green"))
		transports.add(CarLada(color = "Green"))

		transports.add(BicycleAist(color = "Blue"))
		transports.add(BicycleStels(250, "Blue"))
		transports.add(CarVolkswagen(color = "Blue"))
		transports.add(CarLada(5500, "Blue"))

		transports.add(BicycleStelsImproved(color = "Grey", improve = "Packed"))
		transports.add(CarVolkswagenImproved(color = "Grey", improve = "Sportline"))
		transports.add(CarVolkswagenImproved(color = "Grey", improve = "Chroming"))
		transports.add(CarLadaImproved(color = "Violet", improve = "Sedan Baklazhan"))
		transports.add(BicycleAistImproved(color = "Shit", improve = "SUPERAIST"))

		return transports
	}
}